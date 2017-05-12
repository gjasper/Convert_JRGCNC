package br.com.jaraguacnc.dxfmodel;

import br.com.jaraguacnc.utils.Consts;

public class DXFVertex extends DXFEntity{

	double coordinateX;
	double coordinateY;
	double bulge;
	
	public DXFVertex(){
		setType(Consts.DXF_TYPE_VERTEX);
	}
	
	public DXFVertex(String layer){
		setType(Consts.DXF_TYPE_VERTEX);
		setLayer(layer);
	}
	
	public double getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(double coordinateX) {
		this.coordinateX = coordinateX;
	}
	public double getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(double coordinateY) {
		this.coordinateY = coordinateY;
	}
	public double getBulge() {
		return bulge;
	}
	public void setBulge(double bulge) {
		this.bulge = bulge;
	}
	
}
