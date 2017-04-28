package br.com.jaraguacnc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Line")
public class Line {
	@XmlElement(name="LineName")
	String lineName;
	@XmlElement(name="LineType")
	String lineType;
	@XmlElement(name="Continued")
	String continued;
	@XmlElement(name="StartLine")
	String startLine;
	@XmlElement(name="StopLine")
	String stopLine;
	@XmlElement(name="PositionCenter")
	String positionCenter;
	@XmlElement(name="Diameter")
	String diameter;
	@XmlElement(name="Depth")
	String depth;
	@XmlElement(name="StartAng")
	String startAng;
	@XmlElement(name="StopAng")
	String stopAng;
	@XmlElement(name="Ang")
	String ang;
	
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineType() {
		return lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public String getContinued() {
		return continued;
	}
	public void setContinued(String continued) {
		this.continued = continued;
	}
	public String getStartLine() {
		return startLine;
	}
	public void setStartLine(String startLine) {
		this.startLine = startLine;
	}
	public String getStopLine() {
		return stopLine;
	}
	public void setStopLine(String stopLine) {
		this.stopLine = stopLine;
	}
	public String getPositionCenter() {
		return positionCenter;
	}
	public void setPositionCenter(String positionCenter) {
		this.positionCenter = positionCenter;
	}
	public String getDiameter() {
		return diameter;
	}
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getStartAng() {
		return startAng;
	}
	public void setStartAng(String startAng) {
		this.startAng = startAng;
	}
	public String getStopAng() {
		return stopAng;
	}
	public void setStopAng(String stopAng) {
		this.stopAng = stopAng;
	}
	public String getAng() {
		return ang;
	}
	public void setAng(String ang) {
		this.ang = ang;
	}
	
}
