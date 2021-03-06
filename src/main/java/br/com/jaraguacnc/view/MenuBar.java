package br.com.jaraguacnc.view;

import javax.swing.JButton;
import javax.swing.JToolBar;

import br.com.jaraguacnc.application.Controller;
import br.com.jaraguacnc.utils.UiConsts;

public class MenuBar extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton newButton;
	JButton saveButton;
	
	protected MenuBar(){

		newButton = new JButton(UiConsts.NEW_BUTTON_TEXT);
		saveButton = new JButton(UiConsts.SAVE_BUTTON_TEXT);
		
		add(newButton);
		add(saveButton);
	}

	public void addListener(Controller controller){
		newButton.addActionListener(controller);
		saveButton.addActionListener(controller);
	}

	public JButton getNewButton() {
		return newButton;
	}

	public void setNewButton(JButton newButton) {
		this.newButton = newButton;
	}

	public JButton getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(JButton saveButton) {
		this.saveButton = saveButton;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	
}
