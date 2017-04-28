package br.com.jaraguacnc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Project")
public class Project {

	String projectId;
	String projectClient;
	String projectName;
	
	public String getProjectId() {
		return projectId;
	}
	@XmlElement(name="ProjectId")
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectClient() {
		return projectClient;
	}
	@XmlElement(name="ProjectClient")
	public void setProjectClient(String projectClient) {
		this.projectClient = projectClient;
	}
	public String getProjectName() {
		return projectName;
	}
	@XmlElement(name="ProjectName")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
		
	
	
}
