package br.com.jaraguacnc.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class GUI extends JPanel{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MenuBar menuBar;
     CenterPanel centerPanel;
     StatusBar statusBar;
     
	public GUI(){
        super(new BorderLayout());
        
        MenuBar menuBar = new MenuBar();
        CenterPanel centerPanel = new CenterPanel();
        StatusBar statusBar = new StatusBar();
               
        add(menuBar, BorderLayout.PAGE_START);
        add(centerPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.PAGE_END);
	}
	
}
