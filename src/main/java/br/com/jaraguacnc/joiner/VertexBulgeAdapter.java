package br.com.jaraguacnc.joiner;

import br.com.jaraguacnc.dxfmodel.DXFVertex;
import br.com.jaraguacnc.dxfmodel.EXTD_DXFBulge;

public class VertexBulgeAdapter {

	public DXFVertex marshallEndCoord (EXTD_DXFBulge line){
		
		DXFVertex vertex = new DXFVertex(line.getLayer());
		vertex.setCoordinateX(line.getEndPointX());
		vertex.setCoordinateY(line.getEndPointY());
		vertex.setBulge(line.getBulge());
		
		return vertex;
		
	}
	
	
	public DXFVertex marshallStartCoord (EXTD_DXFBulge line){
		
		DXFVertex vertex = new DXFVertex(line.getLayer());
		vertex.setCoordinateX(line.getStartPointX());
		vertex.setCoordinateY(line.getStartPointY());
		vertex.setBulge(line.getBulge());
		
		return vertex;
	}
	
}
