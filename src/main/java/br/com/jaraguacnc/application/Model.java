package br.com.jaraguacnc.application;

import java.util.ArrayList;
import java.util.List;
import br.com.jaraguacnc.dxfmodel.WrappedDXF;
import br.com.jaraguacnc.xmlmodel.WrappedXML;

public class Model {

	private List<WrappedXML> wrappedXMLs;
	private List<WrappedDXF> wrappedDFXs;
	private String outputRootPath;
	
	public Model(){
		wrappedXMLs = new ArrayList<WrappedXML>();
		wrappedDFXs = new ArrayList<WrappedDXF>();
	}
	public List<WrappedXML> getWrappedXMLs() {
		return wrappedXMLs;
	}

	public void setWrappedXMLs(List<WrappedXML> wrappedXMLs) {
		this.wrappedXMLs = wrappedXMLs;
	}

	public List<WrappedDXF> getWrappedDFXs() {
		return wrappedDFXs;
	}

	public void setWrappedDFXs(List<WrappedDXF> wrappedDFXs) {
		this.wrappedDFXs = wrappedDFXs;
	}

	public String getOutputRootPath() {
		return outputRootPath;
	}

	public void setOutputRootPath(String outputRootPath) {
		this.outputRootPath = outputRootPath;
	}
	
	
}
