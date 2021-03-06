package br.com.jaraguacnc.dxfmodel;

import br.com.jaraguacnc.utils.Consts;

public class DXFLayer extends DXFTable{

	int colorNumber;
	String ltype;
	
	public DXFLayer(String str){
		setName(str);
		setLtype(Consts.DXF_LTYPE_CONTINUOUS);
		setTableType(Consts.DXF_LAYER);
	}
	public DXFLayer(){
		setLtype(Consts.DXF_LTYPE_CONTINUOUS);
		setTableType(Consts.DXF_LAYER);
	}
	public int getColorNumber() {
		return colorNumber;
	}

	public void setColorNumber(int colorNumber) {
		this.colorNumber = colorNumber;
	}

	public String getLtype() {
		return ltype;
	}

	public void setLtype(String ltype) {
		this.ltype = ltype;
	}
	

	public static int nextColor (DXF dxf){
		int nextColorCode = 1;
		for(DXFTable table : dxf.getTables()){
			if(table.getTableType().equals(Consts.DXF_LAYER)){
				nextColorCode++;
			}
		}
		return nextColorCode;
	}		
}
