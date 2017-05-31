package br.com.jaraguacnc.xmlmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Material")
public class XMLMaterial {

	String materialType;
	String materialName;
	String materialThickness;
	int materialAmount;
	String materialEdge;
	
	public String getMaterialType() {
		return materialType;
	}
	@XmlElement(name="MaterialType")
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public String getMaterialName() {
		return materialName;
	}
	@XmlElement(name="MaterialName")
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getMaterialThickness() {
		return materialThickness;
	}
	@XmlElement(name="MaterialThickness")
	public void setMaterialThickness(String materialThickness) {
		this.materialThickness = materialThickness;
	}
	public int getMaterialAmount() {
		return materialAmount;
	}
	@XmlElement(name="MaterialAmount")
	public void setMaterialAmount(int materialAmount) {
		this.materialAmount = materialAmount;
	}
	public String getMaterialEdge() {
		return materialEdge;
	}
	@XmlElement(name="MaterialEdge")
	public void setMaterialEdge(String materialEdge) {
		this.materialEdge = materialEdge;
	}
	
	
		
}
