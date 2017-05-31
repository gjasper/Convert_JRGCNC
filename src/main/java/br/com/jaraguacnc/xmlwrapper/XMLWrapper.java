package br.com.jaraguacnc.xmlwrapper;

import br.com.jaraguacnc.xmlmodel.WrappedXML;
import br.com.jaraguacnc.xmlmodel.XML;

public class XMLWrapper {

	public WrappedXML marshall(XML xml, String name){
		WrappedXML wrappedXML = new WrappedXML();
		
		wrappedXML.setXml(xml);
		wrappedXML.setName(name);
		
		return wrappedXML;		
	}
	
}
