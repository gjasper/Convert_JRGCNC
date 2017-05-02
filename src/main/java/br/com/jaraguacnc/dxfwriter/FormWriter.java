package br.com.jaraguacnc.dxfwriter;

import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.xmlmodel.Line;
import br.com.jaraguacnc.xmlmodel.XML;

public class FormWriter {

	public String write(XML xmlObject){
		
		String dxfLine = "";
		LineWriter lineAdapter = new LineWriter();
		
		dxfLine += Consts.GP_ZERO + "\r\n";
		dxfLine += Consts.SECTION + "\r\n";
		dxfLine += "2" + "\r\n";
		dxfLine += Consts.ENTITIES + "\r\n";
		
		for(Line line : xmlObject.getAsk().getLines()){
			switch(line.getLineType()){
				case 1:
					dxfLine += lineAdapter.write(line);
				break;
				case 2:
				break;
				case 3:
				break;
			}
		}
		
		dxfLine += Consts.GP_ZERO + "\r\n";
		dxfLine += Consts.ENDSEC + "\r\n";
		dxfLine += Consts.GP_ZERO + "\r\n";
		dxfLine += Consts.EOF + "\r\n";
		
		return dxfLine;
	}
	
}
