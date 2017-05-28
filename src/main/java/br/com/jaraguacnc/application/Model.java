package br.com.jaraguacnc.application;

import java.util.ArrayList;
import java.util.List;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.xmlmodel.XML;

public class Model {

	List<XML> xmls;
	List<DXF> dxfs;
	String outputRootPath;
	
	public Model(){
		xmls = new ArrayList<XML>();
		dxfs = new ArrayList<DXF>();
	}
	public List<XML> getXmls() {
		return xmls;
	}
	public void setXmls(List<XML> xmls) {
		this.xmls = xmls;
	}
	public List<DXF> getDxfs() {
		return dxfs;
	}
	public void setDxfs(List<DXF> dxfs) {
		this.dxfs = dxfs;
	}
	public String getOutputRootPath() {
		return outputRootPath;
	}
	public void setOutputRootPath(String outputRootPath) {
		this.outputRootPath = outputRootPath;
	}
	
}
