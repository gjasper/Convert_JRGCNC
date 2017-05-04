package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.dxfmodel.DXFCircle;
import br.com.jaraguacnc.xmlmodel.XMLLine;

public class CircleAdapter {
	
	public DXFCircle marshall(XMLLine xmlLine){
		
		DXFCircle dxfCircle = new DXFCircle(); 
		
		dxfCircle.setCenterPointX(xmlLine.getPositionCenterX());
		dxfCircle.setCenterPointY(xmlLine.getPositionCenterY());
		dxfCircle.setRadius(xmlLine.getDiameter()/(double) 2);
		dxfCircle.setLayer(Integer.toString(xmlLine.getDepth()));
		if(xmlLine.getContinued() == 1){
			dxfCircle.setContinued(true);
		}else{
			dxfCircle.setContinued(false);
		}
		return dxfCircle;
	}
	
}
