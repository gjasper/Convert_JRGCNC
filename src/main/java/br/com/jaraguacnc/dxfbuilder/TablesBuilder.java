package br.com.jaraguacnc.dxfbuilder;

import java.util.List;

import br.com.jaraguacnc.dxfmodel.DXFLayer;
import br.com.jaraguacnc.dxfmodel.DXFLtype;
import br.com.jaraguacnc.dxfmodel.DXFTable;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class TablesBuilder {

	LTypeBuilder lTypeBuilder = new LTypeBuilder();	
	LayerBuilder layerBuilder = new LayerBuilder();
	
	public String build(List<DXFTable> tables){
		
		String dxfOutput = "";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.SECTION + "\r\n";
		dxfOutput += GC.ATTRIBUTE + "\r\n";
		dxfOutput += Consts.TABLES + "\r\n";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.TABLE + "\r\n";
		dxfOutput += GC.ATTRIBUTE + "\r\n";
		dxfOutput += Consts.DXF_LTYPE + "\r\n";
		for(DXFTable table : tables){
			switch(table.getTableType()){
				case Consts.DXF_LTYPE:
					dxfOutput += lTypeBuilder.build((DXFLtype) table);
				break;
			}
		}		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.ENDTAB + "\r\n";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.TABLE + "\r\n";
		dxfOutput += GC.ATTRIBUTE + "\r\n";
		dxfOutput += Consts.DXF_LAYER + "\r\n";
		for(DXFTable table : tables){
			switch(table.getTableType()){
				case Consts.DXF_LAYER:
					dxfOutput += layerBuilder.build((DXFLayer) table);
				break;
			}
		}		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.ENDTAB + "\r\n";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.ENDSEC + "\r\n";
		
		return dxfOutput;
	}
	
}
