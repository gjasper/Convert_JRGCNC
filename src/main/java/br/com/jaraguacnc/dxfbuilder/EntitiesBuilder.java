package br.com.jaraguacnc.dxfbuilder;

import java.util.List;

import br.com.jaraguacnc.dxfmodel.DXFCircle;
import br.com.jaraguacnc.dxfmodel.DXFEntity;
import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.dxfmodel.DXFPolyline;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class EntitiesBuilder{

	LineBuilder lineBuilder = new LineBuilder();
	CircleBuilder circleBuilder = new CircleBuilder();
	PolylineBuilder polylineBuilder = new PolylineBuilder();
	
	public String build(List<DXFEntity> entities){
		
		String dxfOutput = "";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.SECTION + "\r\n";
		dxfOutput += GC.ATTRIBUTE + "\r\n";
		dxfOutput += Consts.ENTITIES + "\r\n";
		
		for(DXFEntity entity : entities){
			switch(entity.getType()){
				case Consts.DXF_TYPE_LINE:
					dxfOutput += lineBuilder.build((DXFLine) entity);
				break;
				case Consts.DXF_TYPE_CIRCLE:
					dxfOutput += circleBuilder.build((DXFCircle) entity);
				break;
				case Consts.DXF_TYPE_POLYLINE:
					dxfOutput += polylineBuilder.build((DXFPolyline) entity);
				break;
			}
		}
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.ENDSEC + "\r\n";
		
		return dxfOutput;
	}
	
}
