package br.com.jaraguacnc.application;

import java.awt.Color;
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
	public void actionPerformed(ActionEvent event) {
		
		MenuBar menuBar = view.getMenuBar();
		CenterPanel centerPanel = view.getCenterPanel();
		InputPanel inputPanel = centerPanel.getInputPanel();
		OutputPanel outputPanel = centerPanel.getOutputPanel();
		StatusBar statusBar = view.getStatusBar();
		
		statusBar.getStatusBarLabel().setForeground(Color.black);
		statusBar.getStatusBarLabel().setText(UiConsts.STATUS_BAR_READY);
		
		try {
			
			if(event.getSource().equals(inputPanel.getOpenButton())){
				int returnVal = inputPanel.getFileChooser().showOpenDialog(inputPanel);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					inputPanel.getXmlList().setText("");
					outputPanel.getDxfList().setText("");	
					model.getWrappedXMLs().clear();
					model.getWrappedDFXs().clear();
		            for(File file : inputPanel.getFileChooser().getSelectedFiles()){
		            	model.getWrappedXMLs().add(wrapper.marshall(reader.read(file), file.getName()));
		            	inputPanel.getXmlList().setText(inputPanel.getXmlList().getText() + (file.getName() + Consts.ENDLN));
		            }
				}
			}else if (event.getSource().equals(centerPanel.getConvertButton())){
				if(model.getWrappedXMLs().isEmpty()){
					throw new Exception(UiConsts.ERROR_MISSING_XML);
				}else{
					outputPanel.getDxfList().setText("");
					model.setWrappedDFXs(facade.convert(model.getWrappedXMLs()));
					for(WrappedDXF wrappedDXF : model.getWrappedDFXs()){
		            	outputPanel.getDxfList().setText(outputPanel.getDxfList().getText() + (wrappedDXF.getFullPath() + Consts.ENDLN));
		            }
				}
			}else if(event.getSource().equals(outputPanel.getOutputFolderButton())){
				int returnVal = outputPanel.getFolderChooser().showOpenDialog(outputPanel);
				if(returnVal == JFileChooser.APPROVE_OPTION){
					outputPanel.getOutputFolderTextField().setText(outputPanel.getFolderChooser().getSelectedFile().toString());
					model.setOutputRootPath(outputPanel.getOutputFolderTextField().getText());
				}
			}else if(event.getSource().equals(menuBar.getNewButton())){
				model.getWrappedXMLs().clear();
				model.getWrappedDFXs().clear();
				inputPanel.getXmlList().setText("");
				outputPanel.getDxfList().setText("");
				model.setOutputRootPath("");
				outputPanel.getOutputFolderTextField().setText("");
			}else if(event.getSource().equals(menuBar.getSaveButton())){
				
				updateOutputFolderPath();
				
				if(model.getWrappedDFXs().isEmpty()){
					throw new Exception(UiConsts.ERROR_MISSING_DXF);
				}else if(model.getOutputRootPath().equals("")){
					throw new Exception(UiConsts.ERROR_OUTPUT_FOLDER);
				}else{
					for(WrappedDXF wrappedDXF : model.getWrappedDFXs()){
						writer.write(wrappedDXF, model.getOutputRootPath());
					}
					statusBar.getStatusBarLabel().setForeground(Color.blue);
					statusBar.getStatusBarLabel().setText(UiConsts.WRITING_SUCCESS);	
				}				
			}
		
		} catch (Exception e) {
			statusBar.getStatusBarLabel().setForeground(Color.red);
			if(e.getMessage()!= null){
				statusBar.getStatusBarLabel().setText(e.getMessage());
			}else{
				statusBar.getStatusBarLabel().setText(e.getClass().getName());
			}
		}
		
	}
	
	public void updateOutputFolderPath(){
		if(model.getOutputRootPath().equals("")){
			if(view.getCenterPanel().getOutputPanel().getOutputFolderTextField().getText().equals("")){
				return;
			}else{
				model.setOutputRootPath(view.getCenterPanel().getOutputPanel().getOutputFolderTextField().getText());
			}			
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
