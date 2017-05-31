package br.com.jaraguacnc.dxfwrapper;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.dxfmodel.WrappedDXF;
import br.com.jaraguacnc.xmlmodel.WrappedXML;
import br.com.jaraguacnc.xmlmodel.XMLMaterial;
import br.com.jaraguacnc.xmlmodel.XMLProject;

public class DXFWrapper {

	public WrappedDXF marshall(DXF dxf, WrappedXML wrappedXML){
		WrappedDXF wrappedDXF = new WrappedDXF();
		
		XMLProject project = wrappedXML.getXml().getProject();
		XMLMaterial material = wrappedXML.getXml().getAsk().getMaterial();
		
		wrappedDXF.setDxf(dxf);
		wrappedDXF.setName(wrappedXML.getName().split("\\.")[0] + ".dxf");
		wrappedDXF.setPath(	"\\" + 
							project.getProjectClient() + 
							"\\" + 
							project.getProjectId() + 
							"\\" + 
							project.getProjectName() + 
							"\\" + 
							material.getMaterialType() + "_" + material.getMaterialName() + "_" + material.getMaterialThickness());
		wrappedDXF.setAmount(wrappedXML.getXml().getAsk().getMaterial().getMaterialAmount());
		return wrappedDXF;
	}
	
}
