package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFPolyline;
import br.com.jaraguacnc.dxfmodel.DXFVertex;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class PolylineBuilder extends EntityBuilder{

	VertexBuilder vertexBuilder = new VertexBuilder();
	
	public String build(DXFPolyline polyline){
		String dxfLine = "";
		
		dxfLine = buildEntity(polyline);
		dxfLine += GC.VERTEX_FOLLOW + "\r\n";		dxfLine += Consts.VALUE_1 + "\r\n";
		dxfLine += GC.PRIMARY_X + "\r\n";		dxfLine += Consts.VALUE_DOUBLE_0 + "\r\n";
		dxfLine += GC.PRIMARY_Y + "\r\n";		dxfLine += Consts.VALUE_DOUBLE_0 + "\r\n";
		dxfLine += GC.PRIMARY_Z + "\r\n";		dxfLine += Consts.VALUE_DOUBLE_0 + "\r\n";
		dxfLine += GC.FLAG + "\r\n";		dxfLine += Consts.VALUE_1 + "\r\n";

		for(DXFVertex vertex : polyline.getVertexList()){
			dxfLine += vertexBuilder.build(vertex);
		}
		
		dxfLine += GC.ZERO + "\r\n";		dxfLine += Consts.SEQEND + "\r\n";
		
		return dxfLine;
	}
	
}
