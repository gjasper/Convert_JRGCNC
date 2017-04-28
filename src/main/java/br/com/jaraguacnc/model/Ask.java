package br.com.jaraguacnc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Ask")
public class Ask {

	Material material;
	List<Line> lines;
	
	public Material getMaterial() {
		return material;
	}
	@XmlElement(name="Material")
	public void setMaterial(Material material) {
		this.material = material;
	}
	public List<Line> getLines() {
		return lines;
	}
	@XmlElement(name="Line")
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}
}
