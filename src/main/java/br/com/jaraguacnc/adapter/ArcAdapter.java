package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.dxfmodel.DXFArc;
import br.com.jaraguacnc.xmlmodel.XMLLine;

public class ArcAdapter {

	public DXFArc marshall(XMLLine xmlLine){
		
		DXFArc dxfArc = new DXFArc(); 
		
		dxfArc.setCenterPointX(xmlLine.getPositionCenterX());
		dxfArc.setCenterPointY(xmlLine.getPositionCenterY());
		dxfArc.setStartAngle(xmlLine.getStartAngX());
		dxfArc.setEndAngle(xmlLine.getStartAngY());
		dxfArc.setRadius(xmlLine.getDiameter()/(double) 2);
		dxfArc.setLayer(Integer.toString(xmlLine.getDepth()));
		if(xmlLine.getContinued() == 1){
			dxfArc.setContinued(true);
		}else{
			dxfArc.setContinued(false);
		}
		
		return dxfArc;
	}
}
