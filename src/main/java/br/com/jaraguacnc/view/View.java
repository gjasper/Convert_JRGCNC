package br.com.jaraguacnc.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import br.com.jaraguacnc.application.Controller;

public class View extends JPanel{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MenuBar menuBar;
    CenterPanel centerPanel;
    StatusBar statusBar;
     
	public View(){
        super(new BorderLayout());
        
        menuBar = new MenuBar();
        centerPanel = new CenterPanel();
        statusBar = new StatusBar();
               
        add(menuBar, BorderLayout.PAGE_START);
        add(centerPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.PAGE_END);
	}

	public void addListener(Controller controller){
		centerPanel.addListener(controller);
		menuBar.addListener(controller);
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public CenterPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(CenterPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public StatusBar getStatusBar() {
		return statusBar;
	}

	public void setStatusBar(StatusBar statusBar) {
		this.statusBar = statusBar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
