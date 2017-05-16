package br.com.jaraguacnc.dxfmodel;

public class DXFTable {

	String tableType;
	String name;
	
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DXFLayer){
			DXFLayer table = (DXFLayer) obj;
			if (table.getName().equals(this.getName())){
				return true;
			}
		} else if (obj instanceof DXFLtype) {
			DXFLtype table = (DXFLtype) obj;
			if (table.getName().equals(this.getName())){
				return true;
			}
		}
		return false;
	}	
}
