package br.com.jaraguacnc.dxfmodel;

import java.util.ArrayList;
import java.util.List;

public class DXFTable {

	List<DXFLayer> layers = new ArrayList<DXFLayer>();

	public List<DXFLayer> getLayers() {
		return layers;
	}

	public void setLayers(List<DXFLayer> layers) {
		this.layers = layers;
	}
	
}
