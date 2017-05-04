package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFCircle;
import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class CircleBuilder {

	public String build(DXFCircle line){
		String dxfLine = "";
		
		dxfLine += GC.ZERO + "\r\n";
		dxfLine += Consts.DXF_TYPE_CIRCLE + "\r\n";
		dxfLine += GC.LAYER + "\r\n";
		dxfLine += line.getLayer() + "\r\n";
		dxfLine += GC.PRIMARY_X + "\r\n";
		dxfLine += line.getCenterPointX() + "\r\n";
		dxfLine += GC.PRIMARY_Y + "\r\n";
		dxfLine += line.getCenterPointY() + "\r\n";
		dxfLine += GC.RADIUS + "\r\n";
		dxfLine += line.getRadius() + "\r\n";
		
		return dxfLine;
	}
	
}
