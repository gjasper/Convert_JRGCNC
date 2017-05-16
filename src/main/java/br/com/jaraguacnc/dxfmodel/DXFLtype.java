package br.com.jaraguacnc.dxfmodel;

import br.com.jaraguacnc.utils.Consts;

public class DXFLtype extends DXFTable{

	String description;
	
	public DXFLtype(){
		setTableType(Consts.DXF_LTYPE);
		setName(Consts.DXF_LTYPE_CONTINUOUS);
		setDescription(Consts.DXF_LTYPE_CONTINUOUS_DESC);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
}
