package br.com.jaraguacnc.view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import br.com.jaraguacnc.utils.UiConsts;

public class StatusBar extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel statusBarLabel;
	
	protected StatusBar (){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		statusBarLabel = new JLabel(UiConsts.STATUS_BAR_READY);
		statusBarLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		add(statusBarLabel);
	}

	public JLabel getStatusBarLabel() {
		return statusBarLabel;
	}

	public void setStatusBarLabel(JLabel statusBarLabel) {
		this.statusBarLabel = statusBarLabel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	
}
