package br.com.jaraguacnc.view;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import br.com.jaraguacnc.application.Controller;
import br.com.jaraguacnc.utils.UiConsts;

public class InputPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel xmlInputListLabel;
	JTextPane xmlList;
	JButton openButton;
	JPanel openButtonPanel;
	JFileChooser fileChooser;
	
	protected InputPanel(){

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        xmlInputListLabel = new JLabel(UiConsts.XML_INPUT_LIST_LABEL_TEXT);
        xmlList = new JTextPane();
        xmlList.setEditable(false);
        xmlList.setPreferredSize(new Dimension(500, 500));
        JScrollPane scrollXmliList = new JScrollPane (xmlList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        openButton = new JButton(UiConsts.OPEN_BUTTON_TEXT);
        
        xmlInputListLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        scrollXmliList.setAlignmentX(Component.LEFT_ALIGNMENT);
        openButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
        
		openButtonPanel = new JPanel();
		openButtonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		openButtonPanel.setLayout(new BoxLayout(openButtonPanel, BoxLayout.LINE_AXIS));
        openButtonPanel.add(Box.createHorizontalGlue());
        openButtonPanel.add(openButton);
        
        fileChooser = new JFileChooser("C:\\projetos\\Convert_JRGCNC\\files\\testFile");
        fileChooser.setMultiSelectionEnabled(true);
        
        add(xmlInputListLabel);
        add(scrollXmliList);
        add(openButtonPanel);       
	}
	
	public void addListener(Controller controller){
		openButton.addActionListener(controller);
	}

	public JLabel getXmlInputListLabel() {
		return xmlInputListLabel;
	}

	public void setXmlInputListLabel(JLabel xmlInputListLabel) {
		this.xmlInputListLabel = xmlInputListLabel;
	}

	public JTextPane getXmlList() {
		return xmlList;
	}

	public void setXmlList(JTextPane xmlList) {
		this.xmlList = xmlList;
	}

	public JButton getOpenButton() {
		return openButton;
	}

	public void setOpenButton(JButton openButton) {
		this.openButton = openButton;
	}

	public JPanel getOpenButtonPanel() {
		return openButtonPanel;
	}

	public void setOpenButtonPanel(JPanel openButtonPanel) {
		this.openButtonPanel = openButtonPanel;
	}

	public JFileChooser getFileChooser() {
		return fileChooser;
	}

	public void setFileChooser(JFileChooser fileChooser) {
		this.fileChooser = fileChooser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
