package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFLayer;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class LayerBuilder {

	public String build(DXFLayer layer){
		String dxfOutput = "";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.DXF_LAYER + "\r\n";
		dxfOutput += GC.ATTRIBUTE + "\r\n";
		dxfOutput += layer.getName() + "\r\n";
		dxfOutput += GC.LAYER_COLOR + "\r\n";
		dxfOutput += layer.getColorNumber() + "\r\n";
		dxfOutput += GC.LTYPE + "\r\n";
		dxfOutput += layer.getLtype() + "\r\n";
		
		return dxfOutput;
	}
	
}
