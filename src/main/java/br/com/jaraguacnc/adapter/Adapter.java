package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.xmlmodel.XML;
import br.com.jaraguacnc.xmlmodel.XMLLine;

public class Adapter {

	public DXF marshall (XML xml){
		
		DXF dxf = new DXF();
		
		for(XMLLine xmlLine : xml.getAsk().getLines()){
			switch(xmlLine.getLineType()){
			case Consts.XML_TYPE_LINE:
				//@TODO: POlimorfismo para adicionar especialização de DXFEntity para cada tipo de XML_TYPE
			break;
			}
		}
		
		return dxf;
	}
	
}
