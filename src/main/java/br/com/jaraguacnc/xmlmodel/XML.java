package br.com.jaraguacnc.xmlmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="XML_JARAGUACNC")
public class XML {

	Project project;
	Ask ask;
	
	public Project getProject() {
		return project;
	}
	@XmlElement(name="Project")
	public void setProject(Project project) {
		this.project = project;
	}
	public Ask getAsk() {
		return ask;
	}
	@XmlElement(name="Ask")
	public void setAsk(Ask ask) {
		this.ask = ask;
	}
		
	
	
}
