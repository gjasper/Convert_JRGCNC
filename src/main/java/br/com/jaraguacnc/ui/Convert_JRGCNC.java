package br.com.jaraguacnc.ui;

import java.awt.Dimension;

import javax.swing.*;

import br.com.jaraguacnc.dxfwriter.FormWriter;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.xmlmodel.XML;
import br.com.jaraguacnc.xmlreader.Reader;        
 
public class Convert_JRGCNC {

	private static void createAndShowGUI() {
        JFrame frame = new JFrame(Consts.APPLICATION_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.getContentPane().setPreferredSize(new Dimension(600, 300));
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                Reader reader = new Reader();
				XML xml = reader.read("C:/classes/XML_JARAGUACNC.xml");
				FormWriter writer = new FormWriter();
				System.out.println(writer.write(xml));     
            }
        });
    }
}