package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.dxfmodel.DXFCircle;
import br.com.jaraguacnc.xmlmodel.XMLLine;

public class CircleAdapter {
	
	public DXFCircle convert(XMLLine xmlLine){
		
		DXFCircle dxfCircle = new DXFCircle(); 
		
		dxfCircle.setCenterPointX(xmlLine.getPositionCenterX());
		dxfCircle.setCenterPointY(xmlLine.getPositionCenterY());
		dxfCircle.setRadius(xmlLine.getDiameter()/(double) 2);
		dxfCircle.setLayer(Integer.toString(xmlLine.getDepth()));
		return dxfCircle;
	}
	
}
