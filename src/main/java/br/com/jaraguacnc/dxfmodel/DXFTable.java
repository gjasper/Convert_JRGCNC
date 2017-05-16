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
	public boolean equals(Object o){
		if(o.equals(this.getName())){
			return true;
		}
		return false;
	}
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
	
}
