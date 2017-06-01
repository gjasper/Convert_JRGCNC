package br.com.jaraguacnc.dxfwrapper;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<WrappedDXF> replicate (List<WrappedDXF> wrappedDXFs){
		List<WrappedDXF> newWrappedDXFs = new ArrayList<WrappedDXF>();
		for(WrappedDXF wrappedDXF: wrappedDXFs){
			for (int i = 0; i < wrappedDXF.getAmount(); i++) {
				WrappedDXF newWrappedDXF = wrappedDXF.getClone();
				newWrappedDXF.setName(
						wrappedDXF.getName().split("\\.")[0] +
						"_" + 
						i + 
						"." + 
						wrappedDXF.getName().split("\\.")[1] 
				);
				newWrappedDXFs.add(newWrappedDXF);
			}
		}
		return newWrappedDXFs;
	}
	
}
