package br.com.jaraguacnc.ui;

import java.awt.Dimension;

import javax.swing.*;

import br.com.jaraguacnc.facade.Facade;
import br.com.jaraguacnc.utils.Consts;

public class Convert_JRGCNC {

	private static void createAndShowGUI() {
        JFrame frame = new JFrame(Consts.APPLICATION_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.getContentPane().setPreferredSize(new Dimension(600, 300));
        frame.pack();
        //frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	
        	Facade facade = new Facade();
        	
            public void run() {
                createAndShowGUI();
                String inFilePath = "C:/projetos/Convert_JRGCNC/files/sample.xml";
                String outFilePath = "C:/projetos/Convert_JRGCNC/files/sample.dxf";
                facade.convert(inFilePath, outFilePath);		
            }
        });
    }
}