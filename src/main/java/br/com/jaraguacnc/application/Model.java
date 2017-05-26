package br.com.jaraguacnc.application;

import java.util.Map;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.xmlmodel.XML;

public class Model {

	Map <Integer, Integer> continuityMap;
	XML xml;
	DXF dxf;
	
	public Map<Integer, Integer> getContinuityMap() {
		return continuityMap;
	}
	public void setContinuityMap(Map<Integer, Integer> continuityMap) {
		this.continuityMap = continuityMap;
	}
	public XML getXml() {
		return xml;
	}
	public void setXml(XML xml) {
		this.xml = xml;
	}
	public DXF getDxf() {
		return dxf;
	}
	public void setDxf(DXF dxf) {
		this.dxf = dxf;
	}
	
	
	
}
