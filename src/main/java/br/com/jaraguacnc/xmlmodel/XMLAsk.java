package br.com.jaraguacnc.xmlmodel;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Ask")
public class XMLAsk {

	XMLMaterial material;
	List<XMLLine> lines;
	
	public XMLMaterial getMaterial() {
		return material;
	}
	@XmlElement(name="Material")
	public void setMaterial(XMLMaterial material) {
		this.material = material;
	}
	public List<XMLLine> getLines() {
		return lines;
	}
	@XmlElement(name="Line")
	public void setLines(List<XMLLine> lines) {
		this.lines = lines;
	}
}
