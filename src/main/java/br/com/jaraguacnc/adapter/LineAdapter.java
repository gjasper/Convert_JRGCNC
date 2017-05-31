package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.xmlmodel.XMLLine;

public class LineAdapter {

	public DXFLine convert(XMLLine xmlLine){
		
		DXFLine dxfLine = new DXFLine(); 
		
		dxfLine.setStartPointX(xmlLine.getStartLineX());
		dxfLine.setStartPointY(xmlLine.getStartLineY());
		dxfLine.setEndPointX(xmlLine.getStopLineX());
		dxfLine.setEndPointY(xmlLine.getStopLineY());
		dxfLine.setLayer(Integer.toString(xmlLine.getDepth()));
		
		return dxfLine;
	}
	
}
