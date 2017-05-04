package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.dxfmodel.DXFEntity;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.xmlmodel.XML;
import br.com.jaraguacnc.xmlmodel.XMLLine;

public class Adapter {

	public DXF marshall (XML xml){
		
		LineAdapter lineAdapter = new LineAdapter();
		ArcAdapter arcAdapter = new ArcAdapter();
		CircleAdapter circleAdapter = new CircleAdapter();
		
		DXF dxf = new DXF();
		
		for(XMLLine xmlLine : xml.getAsk().getLines()){
			
			DXFEntity entity = new DXFEntity();
			
			switch(xmlLine.getLineType()){
				case Consts.XML_TYPE_LINE:
					entity = lineAdapter.marshall(xmlLine);
				break;
				case Consts.XML_TYPE_CIRCLE:
					entity = circleAdapter.marshall(xmlLine);
				break;
				case Consts.XML_TYPE_ANG:
					entity = arcAdapter.marshall(xmlLine);
				break;
			}
			
			dxf.getEntities().add(entity);
			
		}
		
		return dxf;
	}
	
}
