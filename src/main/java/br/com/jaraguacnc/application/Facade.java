package br.com.jaraguacnc.application;

import java.util.Map;

import br.com.jaraguacnc.adapter.Adapter;
import br.com.jaraguacnc.dxfbuilder.DXFBuilder;
import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.dxfwriter.DXFWriter;
import br.com.jaraguacnc.joiner.Joiner;
import br.com.jaraguacnc.xmlmodel.XML;
import br.com.jaraguacnc.xmlreader.XMLReader;

public class Facade {

	XMLReader reader = new XMLReader();
	Adapter adapter = new Adapter();
	Joiner joiner = new Joiner();
	DXFBuilder builder = new DXFBuilder();
	DXFWriter writer = new DXFWriter();

	Map <Integer, Integer> continuityMap;
	XML xml;
	DXF dxf;
	
	public void convert (String inFilePath, String outFilePath){
		xml = reader.read(inFilePath);
		dxf = adapter.marshall(xml);
		continuityMap = adapter.generateContinuityMap(xml);
		dxf = joiner.join(dxf, continuityMap);
		System.out.println(builder.build(dxf));
		writer.write(builder.build(dxf), outFilePath);
	}
	
}
