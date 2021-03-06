package br.com.jaraguacnc.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import br.com.jaraguacnc.application.Controller;
import br.com.jaraguacnc.utils.UiConsts;

public class OutputPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel dxfListLabel;
    JTextPane dxfList;
    JLabel outputFolderLabel;
    JPanel outputFolderPanel;
    JPanel outputFolderSelectionPanel;
    JTextField outputFolderTextField;
    JButton outputFolderButton;
    JFileChooser folderChooser;
	
	protected OutputPanel(){

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        dxfListLabel = new JLabel(UiConsts.DXF_OUTPUT_LIST_LABEL_TEXT);
        dxfList = new JTextPane();
        dxfList.setEditable(false);
        dxfList.setPreferredSize(new Dimension(500, 500));
        JScrollPane scrollXmliList = new JScrollPane (dxfList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        outputFolderLabel = new JLabel(UiConsts.OUTPUT_FOLDER_LABEL_TEXT);
        outputFolderPanel = generateOutputFolderSelectionPanel();
        outputFolderPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        
        dxfListLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        scrollXmliList.setAlignmentX(Component.LEFT_ALIGNMENT);
        outputFolderLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        outputFolderPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        folderChooser = new JFileChooser();
        folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        add(dxfListLabel);
        add(scrollXmliList);
        add(outputFolderLabel);
        add(outputFolderPanel);
                
	}
	
	private JPanel generateOutputFolderSelectionPanel(){
		outputFolderSelectionPanel = new JPanel();
		
		outputFolderSelectionPanel.setBackground(Color.yellow);
		outputFolderSelectionPanel.setLayout(new BoxLayout(outputFolderSelectionPanel, BoxLayout.LINE_AXIS));
                
		outputFolderTextField = new JTextField(UiConsts.OUTPUT_FOLDER_QTD_COLUMNS);
		outputFolderButton = new JButton(UiConsts.OUTPUT_FOLDER_BUTTON_TEXT);
		
		outputFolderSelectionPanel.add(outputFolderTextField);
		outputFolderSelectionPanel.add(outputFolderButton);
		
		return outputFolderSelectionPanel;
	}
	
	public void addListener(Controller controller){
		outputFolderButton.addActionListener(controller);
	}

	public JLabel getDxfListLabel() {
		return dxfListLabel;
	}

	public void setDxfListLabel(JLabel dxfListLabel) {
		this.dxfListLabel = dxfListLabel;
	}

	public JTextPane getDxfList() {
		return dxfList;
	}

	public void setDxfList(JTextPane dxfList) {
		this.dxfList = dxfList;
	}

	public JLabel getOutputFolderLabel() {
		return outputFolderLabel;
	}

	public void setOutputFolderLabel(JLabel outputFolderLabel) {
		this.outputFolderLabel = outputFolderLabel;
	}

	public JPanel getOutputFolderPanel() {
		return outputFolderPanel;
	}

	public void setOutputFolderPanel(JPanel outputFolderPanel) {
		this.outputFolderPanel = outputFolderPanel;
	}

	public JPanel getOutputFolderSelectionPanel() {
		return outputFolderSelectionPanel;
	}

	public void setOutputFolderSelectionPanel(JPanel outputFolderSelectionPanel) {
		this.outputFolderSelectionPanel = outputFolderSelectionPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextField getOutputFolderTextField() {
		return outputFolderTextField;
	}

	public void setOutputFolderTextField(JTextField outputFolderTextField) {
		this.outputFolderTextField = outputFolderTextField;
	}

	public JButton getOutputFolderButton() {
		return outputFolderButton;
	}

	public void setOutputFolderButton(JButton outputFolderButton) {
		this.outputFolderButton = outputFolderButton;
	}

	public JFileChooser getFolderChooser() {
		return folderChooser;
	}

	public void setFolderChooser(JFileChooser folderChooser) {
		this.folderChooser = folderChooser;
	}
	
	
	
}
