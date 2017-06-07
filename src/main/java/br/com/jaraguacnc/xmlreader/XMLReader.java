package br.com.jaraguacnc.xmlreader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.jaraguacnc.utils.UiConsts;
import br.com.jaraguacnc.xmlmodel.XML;

public class XMLReader {

	public XML read(File file) throws Exception{
		try {
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(XML.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			XML xml = (XML) jaxbUnmarshaller.unmarshal(file);
			return xml;
		} catch (JAXBException e) {
			throw new Exception(UiConsts.ERROR_READING + e.getLinkedException());
		}
	}
	
}
