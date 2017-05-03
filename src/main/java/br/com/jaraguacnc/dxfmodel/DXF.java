package br.com.jaraguacnc.dxfmodel;

import java.util.ArrayList;
import java.util.List;

public class DXF {

	List<DXFTable> tables = new ArrayList<DXFTable>();
	List<DXFEntity> entities = new ArrayList<DXFEntity>();
	
	public List<DXFTable> getTables() {
		return tables;
	}
	public void setTables(List<DXFTable> tables) {
		this.tables = tables;
	}
	public List<DXFEntity> getEntities() {
		return entities;
	}
	public void setEntities(List<DXFEntity> entities) {
		this.entities = entities;
	}
		
	
}
