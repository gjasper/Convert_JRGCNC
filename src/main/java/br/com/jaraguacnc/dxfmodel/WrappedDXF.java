package br.com.jaraguacnc.dxfmodel;

public class WrappedDXF implements Cloneable{

	DXF dxf;
	String name;
	String path;
	int amount;	
	
	public WrappedDXF getClone(){
        try {
            return (WrappedDXF) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println (" Cloning not allowed. " );
            return this;
        }
	}	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public DXF getDxf() {
		return dxf;
	}
	public void setDxf(DXF dxf) {
		this.dxf = dxf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullPath() {
		return path+"\\"+name;
	}
	
}
