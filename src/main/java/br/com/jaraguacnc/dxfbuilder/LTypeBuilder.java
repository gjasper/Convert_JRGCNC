package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFLtype;
import br.com.jaraguacnc.utils.Consts;
import br.com.jaraguacnc.utils.GC;

public class LTypeBuilder {

	public String build(DXFLtype lType){
		String dxfOutput = "";
		
		dxfOutput += GC.ZERO + "\r\n";
		dxfOutput += Consts.DXF_LTYPE + "\r\n";
		dxfOutput += GC.ATTRIBUTE + "\r\n";
		dxfOutput += lType.getName() + "\r\n";
		dxfOutput += GC.DESCRIPTION + "\r\n";
		dxfOutput += lType.getDescription() + "\r\n";
		
		return dxfOutput;
	}
	
}
