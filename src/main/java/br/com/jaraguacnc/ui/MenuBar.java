package br.com.jaraguacnc.ui;

import javax.swing.JButton;
import javax.swing.JToolBar;

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
	
}
