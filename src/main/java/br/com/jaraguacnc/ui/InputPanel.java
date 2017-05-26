package br.com.jaraguacnc.ui;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import br.com.jaraguacnc.utils.UiConsts;

public class InputPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel xmlInputListLabel;
	JTextArea xmlList;
	JButton openButton;
	JPanel openButtonPanel;
	
	protected InputPanel(){

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        xmlInputListLabel = new JLabel(UiConsts.XML_INPUT_LIST_LABEL_TEXT);
        xmlList = new JTextArea(UiConsts.INPUT_QTD_ROWS,UiConsts.INPUT_QTD_COLUMNS);
        xmlList.setEditable(false);
        openButton = new JButton(UiConsts.OPEN_BUTTON_TEXT);
        
        xmlInputListLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        xmlList.setAlignmentX(Component.LEFT_ALIGNMENT);
        openButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
        
		openButtonPanel = new JPanel();
		openButtonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		openButtonPanel.setLayout(new BoxLayout(openButtonPanel, BoxLayout.LINE_AXIS));
        openButtonPanel.add(Box.createHorizontalGlue());
        openButtonPanel.add(openButton);
        
        add(xmlInputListLabel);
        add(xmlList);
        add(openButtonPanel);
        
	}	
}
