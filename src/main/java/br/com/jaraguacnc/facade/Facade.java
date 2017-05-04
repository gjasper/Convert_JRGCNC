package br.com.jaraguacnc.facade;

import br.com.jaraguacnc.adapter.Adapter;
import br.com.jaraguacnc.dxfbuilder.DXFBuilder;
import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.dxfwriter.DXFWriter;
import br.com.jaraguacnc.xmlmodel.XML;
import br.com.jaraguacnc.xmlreader.XMLReader;

public class Facade {

	XMLReader reader = new XMLReader();
	Adapter adapter = new Adapter();
	DXFBuilder builder = new DXFBuilder();
	DXFWriter writer = new DXFWriter();
	
	public void convert (String inFilePath, String outFilePath){
		XML xml = new XML();
		xml = reader.read(inFilePath);
		DXF dxf = new DXF();
		dxf = adapter.marshall(xml);
		System.out.println(builder.build(dxf));
		writer.write(builder.build(dxf), outFilePath);
	}
	
}
