package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.model.Line;
import br.com.jaraguacnc.model.XML_JARAGUACNC;

public class FormAdapter {

	public String marshall(XML_JARAGUACNC xmlObject){
		
		String dxfLine = "";
		LineAdapter lineAdapter = new LineAdapter();
		
		dxfLine += "0" + "\r\n";
		dxfLine += "SECTION" + "\r\n";
		dxfLine += "2" + "\r\n";
		dxfLine += "ENTITIES" + "\r\n";
		
		for(Line line : xmlObject.getAsk().getLines()){
			switch(line.getLineType()){
				case 1:
					dxfLine += lineAdapter.marshall(line);
				break;
				case 2:
				break;
				case 3:
				break;
			}
		}
		
		dxfLine += "0" + "\r\n";
		dxfLine += "ENDSEC" + "\r\n";
		dxfLine += "0" + "\r\n";
		dxfLine += "EOF" + "\r\n";
		
		return dxfLine;
	}
	
}
