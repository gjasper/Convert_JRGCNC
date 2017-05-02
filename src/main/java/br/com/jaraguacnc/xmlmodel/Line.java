package br.com.jaraguacnc.xmlmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Line")
public class Line {
	int lineName;
	int lineType;
	int continued;
	double startLineX;
	double startLineY;
	double stopLineX;
	double stopLineY;
	double positionCenterX;
	double positionCenterY;
	double diameter;
	int depth;
	double startAngX;
	double startAngY;
	double stopAngX;
	double stopAngY;
	double ang;
	
	@XmlElement(name="LineName")	
	public void setLineName(int lineName) {
		this.lineName = lineName;
	}
	@XmlElement(name="LineType")
	public void setLineType(int lineType) {
		this.lineType = lineType;
	}
	@XmlElement(name="Continued")
	public void setContinued(int continued) {
		this.continued = continued;
	}
	@XmlElement(name="StartLine")
	public void setStartLine(String startLine) {
		String[] parts = startLine.split(",", 2);
		this.startLineX = Double.parseDouble(parts[0]); 
		this.startLineY = Double.parseDouble(parts[1]); 
	}
	@XmlElement(name="StopLine")
	public void setStopLine(String stopLine) {
		String[] parts = stopLine.split(",", 2);
		this.stopLineX = Double.parseDouble(parts[0]); 
		this.stopLineY = Double.parseDouble(parts[1]); 
	}
	@XmlElement(name="PositionCenter")
	public void setPositionCenter(String positionCenter) {
		String[] parts = positionCenter.split(",", 2);
		this.positionCenterX = Double.parseDouble(parts[0]); 
		this.positionCenterY = Double.parseDouble(parts[1]); 
	}
	@XmlElement(name="Diameter")
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	@XmlElement(name="Depth")
	public void setDepth(int depth) {
		this.depth = depth;
	}
	@XmlElement(name="StartAng")
	public void setStartAng(String startAng) {
		String[] parts = startAng.split(",", 2);
		this.startAngX = Double.parseDouble(parts[0]); 
		this.startAngY = Double.parseDouble(parts[1]); 
	}
	@XmlElement(name="StopAng")
	public void setStopAng(String stopAng) {
		String[] parts = stopAng.split(",", 2);
		this.stopAngX = Double.parseDouble(parts[0]); 
		this.stopAngY = Double.parseDouble(parts[1]); 
	}
	@XmlElement(name="Ang")
	public void setAng(Double ang) {
		this.ang = ang;
	}
	
	
	public double getStartLineX() {
		return startLineX;
	}
	public void setStartLineX(double startLineX) {
		this.startLineX = startLineX;
	}
	public double getStartLineY() {
		return startLineY;
	}
	public void setStartLineY(double startLineY) {
		this.startLineY = startLineY;
	}
	public double getStopLineX() {
		return stopLineX;
	}
	public void setStopLineX(double stopLineX) {
		this.stopLineX = stopLineX;
	}
	public double getStopLineY() {
		return stopLineY;
	}
	public void setStopLineY(double stopLineY) {
		this.stopLineY = stopLineY;
	}
	public double getPositionCenterX() {
		return positionCenterX;
	}
	public void setPositionCenterX(double positionCenterX) {
		this.positionCenterX = positionCenterX;
	}
	public double getPositionCenterY() {
		return positionCenterY;
	}
	public void setPositionCenterY(double positionCenterY) {
		this.positionCenterY = positionCenterY;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public int getDepth() {
		return depth;
	}
	public double getStartAngX() {
		return startAngX;
	}
	public void setStartAngX(double startAngX) {
		this.startAngX = startAngX;
	}
	public double getStartAngY() {
		return startAngY;
	}
	public void setStartAngY(double startAngY) {
		this.startAngY = startAngY;
	}
	public double getStopAngX() {
		return stopAngX;
	}
	public void setStopAngX(double stopAngX) {
		this.stopAngX = stopAngX;
	}
	public double getStopAngY() {
		return stopAngY;
	}
	public void setStopAngY(double stopAngY) {
		this.stopAngY = stopAngY;
	}
	public double getAng() {
		return ang;
	}
	public void setAng(double ang) {
		this.ang = ang;
	}
	public int getLineName() {
		return lineName;
	}
	public int getLineType() {
		return lineType;
	}
	public int getContinued() {
		return continued;
	}
	
	
}
