package br.com.jaraguacnc.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.jaraguacnc.adapter.Adapter;
import br.com.jaraguacnc.dxfbuilder.DXFBuilder;
import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.joiner.Joiner;
import br.com.jaraguacnc.xmlmodel.XML;

public class Facade {

	Adapter adapter = new Adapter();
	Joiner joiner = new Joiner();
	DXFBuilder builder = new DXFBuilder();

	Map <Integer, Integer> continuityMap;
	XML xml;
	DXF dxf;
	
	public List<DXF> convert (List<XML> xmls){
		List<DXF> dxfs = new ArrayList<DXF>();
		for(XML xml: xmls){
			dxf = adapter.marshall(xml);
			continuityMap = adapter.generateContinuityMap(xml);
			dxf = joiner.join(dxf, continuityMap);
			dxfs.add(dxf);
		}
		return dxfs;
	}
	
}
