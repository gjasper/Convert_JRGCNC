package br.com.jaraguacnc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Line")
public class Line {
	String lineName;
	String lineType;
	String continued;
	String startLine;
	String stopLine;
	String positionCenter;
	String diameter;
	String depth;
	String startAng;
	String stopAng;
	String ang;
	
	public String getLineName() {
		return lineName;
	}
	@XmlElement(name="LineName")	
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineType() {
		return lineType;
	}
	@XmlElement(name="LineType")
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public String getContinued() {
		return continued;
	}
	@XmlElement(name="Continued")
	public void setContinued(String continued) {
		this.continued = continued;
	}
	public String getStartLine() {
		return startLine;
	}
	@XmlElement(name="StartLine")
	public void setStartLine(String startLine) {
		this.startLine = startLine;
	}
	public String getStopLine() {
		return stopLine;
	}
	@XmlElement(name="StopLine")
	public void setStopLine(String stopLine) {
		this.stopLine = stopLine;
	}
	public String getPositionCenter() {
		return positionCenter;
	}
	@XmlElement(name="PositionCenter")
	public void setPositionCenter(String positionCenter) {
		this.positionCenter = positionCenter;
	}
	public String getDiameter() {
		return diameter;
	}
	@XmlElement(name="Diameter")
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String getDepth() {
		return depth;
	}
	@XmlElement(name="Depth")
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getStartAng() {
		return startAng;
	}
	@XmlElement(name="StartAng")
	public void setStartAng(String startAng) {
		this.startAng = startAng;
	}
	public String getStopAng() {
		return stopAng;
	}
	@XmlElement(name="StopAng")
	public void setStopAng(String stopAng) {
		this.stopAng = stopAng;
	}
	public String getAng() {
		return ang;
	}
	@XmlElement(name="Ang")
	public void setAng(String ang) {
		this.ang = ang;
	}
	
}
