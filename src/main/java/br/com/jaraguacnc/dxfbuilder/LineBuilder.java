package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.utils.GC;

public class LineBuilder extends EntityBuilder{

	public String build(DXFLine line){
		String dxfLine = "";
		
		dxfLine += buildEntity(line);
		dxfLine += GC.PRIMARY_X + "\r\n";
		dxfLine += line.getStartPointX() + "\r\n";
		dxfLine += GC.PRIMARY_Y + "\r\n";
		dxfLine += line.getStartPointY() + "\r\n";
		dxfLine += (GC.PRIMARY_X+1) + "\r\n";
		dxfLine += line.getEndPointX() + "\r\n";
		dxfLine += (GC.PRIMARY_Y+1) + "\r\n";
		dxfLine += line.getEndPointY() + "\r\n";
		
		return dxfLine;
	}
	
}
