package br.com.jaraguacnc.adapter;

import br.com.jaraguacnc.dxfmodel.EXTD_DXFBulge;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.xmlmodel.XMLLine;

public class BulgeAdapter {
	
	public EXTD_DXFBulge convert (XMLLine xmlLine){
		
		EXTD_DXFBulge bulge = new EXTD_DXFBulge();
		bulge.setStartPointX(xmlLine.getStartAngX());
		bulge.setStartPointY(xmlLine.getStartAngY());
		bulge.setEndPointX(xmlLine.getStopAngX());
		bulge.setEndPointY(xmlLine.getStopAngY());
		bulge.setBulge(bulge.calculateBulge(xmlLine.getAng()));			
		if(xmlLine.getLineName() == Consts.PERFILAGEM_LINE_NAME){
			bulge.setLayer(Consts.PERFILAGEM);
		}else{
			bulge.setLayer(Integer.toString(xmlLine.getDepth()) + Consts.MM_UNIT);
		}
		
		return bulge;
		
	}
	
}
