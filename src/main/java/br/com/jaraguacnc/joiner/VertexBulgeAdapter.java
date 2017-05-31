package br.com.jaraguacnc.joiner;

import br.com.jaraguacnc.dxfmodel.DXFVertex;
import br.com.jaraguacnc.dxfmodel.EXTD_DXFBulge;

public class VertexBulgeAdapter {

	public DXFVertex convertEndCoord (EXTD_DXFBulge line){
		
		DXFVertex vertex = new DXFVertex(line.getLayer());
		vertex.setCoordinateX(line.getEndPointX());
		vertex.setCoordinateY(line.getEndPointY());
		vertex.setBulge(line.getBulge());
		
		return vertex;
		
	}
	
	
	public DXFVertex convertStartCoord (EXTD_DXFBulge line){
		
		DXFVertex vertex = new DXFVertex(line.getLayer());
		vertex.setCoordinateX(line.getStartPointX());
		vertex.setCoordinateY(line.getStartPointY());
		vertex.setBulge(line.getBulge());
		
		return vertex;
	}
	
}
