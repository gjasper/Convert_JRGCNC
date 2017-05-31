package br.com.jaraguacnc.application;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import br.com.jaraguacnc.dxfmodel.WrappedDXF;
import br.com.jaraguacnc.dxfwriter.DXFWriter;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.UiConsts;
import br.com.jaraguacnc.view.CenterPanel;
import br.com.jaraguacnc.view.InputPanel;
import br.com.jaraguacnc.view.MenuBar;
import br.com.jaraguacnc.view.OutputPanel;
import br.com.jaraguacnc.view.StatusBar;
import br.com.jaraguacnc.view.View;
import br.com.jaraguacnc.xmlreader.XMLReader;
import br.com.jaraguacnc.xmlwrapper.XMLWrapper;

public class Controller implements ActionListener{

	XMLReader reader;
	XMLWrapper wrapper;
	DXFWriter writer;
	
	Model model;
	View view;
	Facade facade;
	
	public Controller(View view, Model model){
		
		reader = new XMLReader();
		writer = new DXFWriter();
		wrapper = new XMLWrapper();
		
		setModel(model);
		setView(view);
		setFacade(new Facade());
		
		view.addListener(this);
	}
	
	public void runApplication(){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
	private void createAndShowGUI() {
        JFrame frame = new JFrame(UiConsts.APPLICATION_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        frame.setContentPane(view);
        
        frame.getContentPane().setPreferredSize(new Dimension(1000, 500));
        frame.pack();
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		MenuBar menuBar = view.getMenuBar();
		CenterPanel centerPanel = view.getCenterPanel();
		InputPanel inputPanel = centerPanel.getInputPanel();
		OutputPanel outputPanel = centerPanel.getOutputPanel();
		StatusBar statusBar = view.getStatusBar();
		String msg = new String();
		
		if(e.getSource().equals(inputPanel.getOpenButton())){
			int returnVal = inputPanel.getFileChooser().showOpenDialog(inputPanel);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				inputPanel.getXmlList().setText("");
				outputPanel.getDxfList().setText("");	
				model.getWrappedXMLs().clear();
				model.getWrappedDFXs().clear();
	            for(File file : inputPanel.getFileChooser().getSelectedFiles()){
	            	model.getWrappedXMLs().add(wrapper.marshall(reader.read(file), file.getName()));
	            	inputPanel.getXmlList().append(file.getName() + Consts.ENDLN);
	            }
			}
		}else if (e.getSource().equals(centerPanel.getConvertButton())){
			outputPanel.getDxfList().setText("");
			model.setWrappedDFXs(facade.convert(model.getWrappedXMLs()));
			for(WrappedDXF wrappedDXF : model.getWrappedDFXs()){
            	outputPanel.getDxfList().append(wrappedDXF.getFullPath() + Consts.ENDLN);
            }
		}else if(e.getSource().equals(outputPanel.getOutputFolderButton())){
			int returnVal = outputPanel.getFolderChooser().showOpenDialog(outputPanel);
			if(returnVal == JFileChooser.APPROVE_OPTION){
				outputPanel.getOutputFolderTextField().setText(outputPanel.getFolderChooser().getSelectedFile().toString());
				model.setOutputRootPath(outputPanel.getOutputFolderTextField().getText());
			}
		}else if(e.getSource().equals(menuBar.getNewButton())){
			model.getWrappedXMLs().clear();
			model.getWrappedDFXs().clear();
			inputPanel.getXmlList().setText("");
			outputPanel.getDxfList().setText("");
			model.setOutputRootPath("");
			outputPanel.getOutputFolderTextField().setText("");
		}else if(e.getSource().equals(menuBar.getSaveButton())){
			for(WrappedDXF wrappedDXF : model.getWrappedDFXs()){
				writer.write(wrappedDXF, model.getOutputRootPath());
			}
			statusBar.getStatusBarLabel().setText("Success");
		}
		
	}
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}
}
