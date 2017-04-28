package br.com.jaraguacnc.ui;

import java.io.File;

import javax.swing.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.jaraguacnc.model.Ask;
import br.com.jaraguacnc.model.Line;
import br.com.jaraguacnc.model.XML_JARAGUACNC;        
 
public class Convert_JRGCNC {

	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                
				try {
					
					File file = new File("C:/classes/XML_JARAGUACNC.xml");
					JAXBContext jaxbContext = JAXBContext.newInstance(XML_JARAGUACNC.class);
					Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
					XML_JARAGUACNC xml = (XML_JARAGUACNC) jaxbUnmarshaller.unmarshal(file);
					System.out.println(xml.toString());
	        		
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                   
            }
        });
    }
}