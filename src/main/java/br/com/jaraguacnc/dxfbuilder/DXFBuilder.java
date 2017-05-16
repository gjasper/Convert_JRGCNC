package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class DXFBuilder {

	TablesBuilder tablesBuilder = new TablesBuilder();
	EntitiesBuilder entitiesBuilder = new EntitiesBuilder();
	
	public String build(DXF dxfObject){
		
		String dxfOutput = "";

		dxfOutput += GC.COMMENT + "\r\n";
		dxfOutput += Consts.DXF_HEADER_COMMENT + "\r\n";
			
		dxfOutput += tablesBuilder.build(dxfObject.getTables());
		dxfOutput += entitiesBuilder.build(dxfObject.getEntities());

		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.EOF + "\r\n";
		
		return dxfOutput;
	}
	
}
