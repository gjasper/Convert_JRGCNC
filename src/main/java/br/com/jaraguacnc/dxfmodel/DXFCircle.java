package br.com.jaraguacnc.dxfmodel;

import br.com.jaraguacnc.utils.Consts;

public class DXFCircle extends DXFEntity{

	double centerPointX;
	double centerPointY;
	double radius;
	
	public DXFCircle(){
		setType(Consts.DXF_TYPE_CIRCLE);
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
		
}
