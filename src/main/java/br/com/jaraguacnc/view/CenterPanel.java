package br.com.jaraguacnc.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.jaraguacnc.application.Controller;
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
	
	public void addListener(Controller controller){
		inputPanel.addListener(controller);
		convertButton.addActionListener(controller);
		outputPanel.addListener(controller);
	}

	public InputPanel getInputPanel() {
		return inputPanel;
	}

	public void setInputPanel(InputPanel inputPanel) {
		this.inputPanel = inputPanel;
	}

	public JButton getConvertButton() {
		return convertButton;
	}

	public void setConvertButton(JButton convertButton) {
		this.convertButton = convertButton;
	}

	public OutputPanel getOutputPanel() {
		return outputPanel;
	}

	public void setOutputPanel(OutputPanel outputPanel) {
		this.outputPanel = outputPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
