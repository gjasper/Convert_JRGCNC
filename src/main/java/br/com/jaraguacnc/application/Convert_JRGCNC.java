package br.com.jaraguacnc.application;
import br.com.jaraguacnc.view.View;

public class Convert_JRGCNC {

	static Controller controller;
	static View view;
	static Model model;
	 
    public static void main(String[] args) {
    	view = new View();
    	model = new Model();
        controller = new Controller(new View(), new Model());
        controller.runApplication();
    }
}