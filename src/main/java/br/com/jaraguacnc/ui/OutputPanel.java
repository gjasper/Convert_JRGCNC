package br.com.jaraguacnc.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.jaraguacnc.utils.UiConsts;

public class OutputPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel dxfListLabel;
    JTextArea dxfList;
    JLabel outputFolderLabel;
    JPanel outputFolderPanel;
    JPanel outputFolderSelectionPanel;
	
	protected OutputPanel(){

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        dxfListLabel = new JLabel(UiConsts.DXF_OUTPUT_LIST_LABEL_TEXT);
        dxfList = new JTextArea(UiConsts.OUTPUT_QTD_ROWS,UiConsts.OUTPUT_QTD_COLUMNS);
        dxfList.setEditable(false);
        outputFolderLabel = new JLabel(UiConsts.OUTPUT_FOLDER_LABEL_TEXT);
        outputFolderPanel = generateOutputFolderSelectionPanel();
        
        dxfListLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        dxfList.setAlignmentX(Component.LEFT_ALIGNMENT);
        outputFolderLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        outputFolderPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        add(dxfListLabel);
        add(dxfList);
        add(outputFolderLabel);
        add(outputFolderPanel);
        
	}
	
	private JPanel generateOutputFolderSelectionPanel(){
		outputFolderSelectionPanel = new JPanel();
		
		outputFolderSelectionPanel.setBackground(Color.yellow);
		outputFolderSelectionPanel.setLayout(new BoxLayout(outputFolderSelectionPanel, BoxLayout.LINE_AXIS));
                
		JTextField outputFolderTextField = new JTextField(UiConsts.OUTPUT_FOLDER_QTD_COLUMNS);
		JButton outputFolderButton = new JButton(UiConsts.OUTPUT_FOLDER_BUTTON_TEXT);
		
		outputFolderSelectionPanel.add(outputFolderTextField);
		outputFolderSelectionPanel.add(outputFolderButton);
		
		return outputFolderSelectionPanel;
	}
	
	
	
}
