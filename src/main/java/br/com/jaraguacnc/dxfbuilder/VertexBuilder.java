package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFVertex;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class VertexBuilder extends EntityBuilder{
	
	public String build(DXFVertex entity){
		String dxfLine = "";
		
		dxfLine += buildEntity(entity);
		dxfLine += GC.PRIMARY_X + "\r\n";
		dxfLine += entity.getCoordinateX() + "\r\n";
		dxfLine += GC.PRIMARY_Y + "\r\n";
		dxfLine += entity.getCoordinateY() + "\r\n";
		dxfLine += GC.PRIMARY_Z + "\r\n";
		dxfLine += Consts.VALUE_DOUBLE_0 + "\r\n";
		
		return dxfLine;
	}
	
}
