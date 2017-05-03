package br.com.jaraguacnc.xmlmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Material")
public class XMLMaterial {

	String materialType;
	String materialName;
	String materialThickness;
	String materialAmount;
	String materialEdge;
	
	public String getMaterialType() {
		return materialType;
	}
	@XmlElement(name="materialType")
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
	public String getMaterialAmount() {
		return materialAmount;
	}
	@XmlElement(name="MaterialAmount")
	public void setMaterialAmount(String materialAmount) {
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
