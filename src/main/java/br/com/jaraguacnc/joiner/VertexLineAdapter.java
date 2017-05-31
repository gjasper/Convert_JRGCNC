package br.com.jaraguacnc.joiner;

import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.dxfmodel.DXFVertex;

public class VertexLineAdapter {

	public DXFVertex convertEndCoord (DXFLine line){
		
		DXFVertex vertex = new DXFVertex(line.getLayer());
		vertex.setCoordinateX(line.getEndPointX());
		vertex.setCoordinateY(line.getEndPointY());
		vertex.setBulge(0);
		
		return vertex;
		
	}
	
	
	public DXFVertex convertStartCoord (DXFLine line){
		
		DXFVertex vertex = new DXFVertex(line.getLayer());
		vertex.setCoordinateX(line.getStartPointX());
		vertex.setCoordinateY(line.getStartPointY());
		vertex.setBulge(0);
		
		return vertex;
	}
}
