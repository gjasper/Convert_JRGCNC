package br.com.jaraguacnc.dxfmodel;

import br.com.jaraguacnc.utils.Consts;

public class DXFArc extends DXFEntity{

	double centerPointX;
	double centerPointY;
	double radius;
	double startAngle;
	double endAngle;
	
	public DXFArc(){
		setType(Consts.DXF_TYPE_ARC);
	}
	public double getCenterPointX() {
		return centerPointX;
	}
	public void setCenterPointX(double centerPointX) {
		this.centerPointX = centerPointX;
	}
	public double getCenterPointY() {
		return centerPointY;
	}
	public void setCenterPointY(double centerPointY) {
		this.centerPointY = centerPointY;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getStartAngle() {
		return startAngle;
	}
	public void setStartAngle(double startAngle) {
		this.startAngle = startAngle;
	}
	public double getEndAngle() {
		return endAngle;
	}
	public void setEndAngle(double endAngle) {
		this.endAngle = endAngle;
	}
}
