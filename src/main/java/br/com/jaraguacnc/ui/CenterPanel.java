package br.com.jaraguacnc.ui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.jaraguacnc.utils.UiConsts;

public class CenterPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InputPanel inputPanel;
	private JButton convertButton;
	private OutputPanel outputPanel;
	
	public CenterPanel(){
        
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        inputPanel = new InputPanel();
        convertButton = new JButton(UiConsts.CONVERT_BUTTON_TEXT);
        outputPanel = new OutputPanel();
        
        add(inputPanel);
        add(convertButton);
        add(outputPanel);
	}
	
	
}
