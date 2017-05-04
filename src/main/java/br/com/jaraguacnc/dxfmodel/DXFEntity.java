package br.com.jaraguacnc.dxfmodel;

public class DXFEntity {

	String layer;
	boolean continued = false;
	String type;
	
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}
	public boolean isContinued() {
		return continued;
	}
	public void setContinued(boolean continued) {
		this.continued = continued;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
