package br.com.jaraguacnc.xmlmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="XML_JARAGUACNC")
public class XML {

	XMLProject project;
	XMLAsk ask;
	
	public XMLProject getProject() {
		return project;
	}
	@XmlElement(name="Project")
	public void setProject(XMLProject project) {
		this.project = project;
	}
	public XMLAsk getAsk() {
		return ask;
	}
	@XmlElement(name="Ask")
	public void setAsk(XMLAsk ask) {
		this.ask = ask;
	}
		
	
	
}
