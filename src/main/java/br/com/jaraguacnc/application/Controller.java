package br.com.jaraguacnc.application;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import br.com.jaraguacnc.utils.UiConsts;
import br.com.jaraguacnc.view.InputPanel;
import br.com.jaraguacnc.view.View;

public class Controller implements ActionListener{

	Model model;
	View view;
	Facade facade;
	
	public Controller(View view, Model model){
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
		
		InputPanel inputPanel = view.getCenterPanel().getInputPanel();
		
		if(e.getSource().equals(inputPanel.getOpenButton())){
			int returnVal = inputPanel.getFileChooser().showOpenDialog(inputPanel);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
	            File file = inputPanel.getFileChooser().getSelectedFile();
	            inputPanel.getXmlList().append(file.getName());
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
