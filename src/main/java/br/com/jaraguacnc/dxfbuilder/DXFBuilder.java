package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.dxfmodel.DXFCircle;
import br.com.jaraguacnc.dxfmodel.DXFEntity;
import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class DXFBuilder {

	public String build(DXF dxfObject){
		
		LineBuilder lineBuilder = new LineBuilder();
		CircleBuilder circleBuilder = new CircleBuilder();
		String dxfOutput = "";

		dxfOutput += GC.COMMENT + "\r\n";
		dxfOutput += Consts.DXF_HEADER_COMMENT + "\r\n";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.SECTION + "\r\n";
		dxfOutput += GC.ATTRIBUTE + "\r\n";
		dxfOutput += Consts.ENTITIES + "\r\n";
		
		for(DXFEntity entity : dxfObject.getEntities()){
			switch(entity.getType()){
				case Consts.DXF_TYPE_LINE:
					dxfOutput += lineBuilder.build((DXFLine) entity);
				break;
				case Consts.DXF_TYPE_CIRCLE:
					dxfOutput += circleBuilder.build((DXFCircle) entity);
				break;
			}
		}
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.ENDSEC + "\r\n";
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.EOF + "\r\n";
		
		return dxfOutput;
	}
	
}
