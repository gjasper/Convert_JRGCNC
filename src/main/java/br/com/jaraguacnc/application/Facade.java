package br.com.jaraguacnc.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.jaraguacnc.adapter.Adapter;
import br.com.jaraguacnc.dxfbuilder.DXFBuilder;
import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.dxfmodel.WrappedDXF;
import br.com.jaraguacnc.dxfwrapper.DXFWrapper;
import br.com.jaraguacnc.joiner.Joiner;
import br.com.jaraguacnc.xmlmodel.WrappedXML;
import br.com.jaraguacnc.xmlmodel.XML;

public class Facade {

	Adapter adapter = new Adapter();
	Joiner joiner = new Joiner();
	DXFBuilder builder = new DXFBuilder();
	DXFWrapper wrapper = new DXFWrapper();

	Map <Integer, Integer> continuityMap;
	XML xml;
	DXF dxf;
	
	public List<WrappedDXF> convert (List<WrappedXML> wrappedXMLs){
		List<WrappedDXF> dxfs = new ArrayList<WrappedDXF>();
		for(WrappedXML wrappedXML: wrappedXMLs){
			dxf = adapter.convert(wrappedXML.getXml());
			continuityMap = adapter.generateContinuityMap(wrappedXML.getXml());
			dxf = joiner.join(dxf, continuityMap);
			dxfs.add(wrapper.marshall(dxf, wrappedXML));
		}
		return dxfs;
	}
	
}
