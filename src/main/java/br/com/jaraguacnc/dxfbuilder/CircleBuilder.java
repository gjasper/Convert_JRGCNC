package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFCircle;
import br.com.jaraguacnc.utils.GC;

public class CircleBuilder extends EntityBuilder{

	public String build(DXFCircle entity){
		String dxfLine = "";
		
		dxfLine += buildEntity(entity);
		dxfLine += GC.PRIMARY_X + "\r\n";
		dxfLine += entity.getCenterPointX() + "\r\n";
		dxfLine += GC.PRIMARY_Y + "\r\n";
		dxfLine += entity.getCenterPointY() + "\r\n";
		dxfLine += GC.RADIUS + "\r\n";
		dxfLine += entity.getRadius() + "\r\n";
		
		return dxfLine;
	}
	
}
