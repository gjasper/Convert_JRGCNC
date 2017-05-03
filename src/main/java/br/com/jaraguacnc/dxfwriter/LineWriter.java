package br.com.jaraguacnc.dxfwriter;

import br.com.jaraguacnc.xmlmodel.XMLLine;

public class LineWriter {

	public String write(XMLLine line){
		String dxfLine = "";
		
		dxfLine += "0" + "\r\n";
		dxfLine += "LINE" + "\r\n";
		dxfLine += "8" + "\r\n";
		
		if(line.getLineName() == 1){
			dxfLine += "LAYER_PERFILAGEM" + "\r\n";
		}else{
			dxfLine += "LAYER_" + line.getDepth() + "\r\n";
		}
		
		dxfLine += 10 + "\r\n";
		dxfLine += line.getStartLineX() + "\r\n";
		dxfLine += 20 + "\r\n";
		dxfLine += line.getStartLineY() + "\r\n";
		dxfLine += 11 + "\r\n";
		dxfLine += line.getStopLineX() + "\r\n";
		dxfLine += 21 + "\r\n";
		dxfLine += line.getStopLineY() + "\r\n";
		
		return dxfLine;
	}
	
}
