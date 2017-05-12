package br.com.jaraguacnc.dxfmodel;

import java.util.ArrayList;
import java.util.List;

import br.com.jaraguacnc.utils.Consts;

public class DXFPolyline extends DXFEntity{

	List <DXFVertex> vertexList = new ArrayList<DXFVertex>();

	public DXFPolyline(String layer){
		setType(Consts.DXF_TYPE_POLYLINE);
		setLayer(layer);
	}
	
	public DXFPolyline(){
		setType(Consts.DXF_TYPE_POLYLINE);
	}
	
	public List<DXFVertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<DXFVertex> vertexList) {
		this.vertexList = vertexList;
	}
	
	public boolean lastVertexMatch(DXFLine line) {
		
		if(line.getEndPointX() == vertexList.get(vertexList.size()-1).getCoordinateX() && line.getEndPointY() == vertexList.get(vertexList.size()-1).getCoordinateY()){
			return true;
		}else{
			return false;
		}
	}
		
}
