package br.com.jaraguacnc.dxfmodel;

import br.com.jaraguacnc.utils.Consts;

public class DXFLine extends DXFEntity{

	double startPointX;
	double startPointY;
	double endPointX;
	double endPointY;

	public DXFLine(){
		setType(Consts.DXF_TYPE_LINE);
	}
	public double getStartPointX() {
		return startPointX;
	}
	public void setStartPointX(double startPointX) {
		this.startPointX = startPointX;
	}
	public double getStartPointY() {
		return startPointY;
	}
	public void setStartPointY(double startPointY) {
		this.startPointY = startPointY;
	}
	public double getEndPointX() {
		return endPointX;
	}
	public void setEndPointX(double endPointX) {
		this.endPointX = endPointX;
	}
	public double getEndPointY() {
		return endPointY;
	}
	public void setEndPointY(double endPointY) {
		this.endPointY = endPointY;
	}

}
