package br.com.jaraguacnc.ui;

import java.awt.Dimension;

import javax.swing.*;

import br.com.jaraguacnc.facade.Facade;
import br.com.jaraguacnc.utils.Consts;

public class Convert_JRGCNC {

	static Facade facade = new Facade();
	static String inFilePath = "C:/projetos/Convert_JRGCNC/files/sampleXML.xml";
	static String outFilePath = "C:/projetos/Convert_JRGCNC/files/sample.dxf";
    
	private static void createAndShowGUI() {
        JFrame frame = new JFrame(Consts.APPLICATION_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.getContentPane().setPreferredSize(new Dimension(600, 300));
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
    	/**
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                facade.convert(inFilePath, outFilePath);		
            }
        });
        **/
        facade.convert(inFilePath, outFilePath);
    }
}