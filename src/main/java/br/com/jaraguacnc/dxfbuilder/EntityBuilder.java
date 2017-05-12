package br.com.jaraguacnc.dxfbuilder;

import br.com.jaraguacnc.dxfmodel.DXFEntity;
import br.com.jaraguacnc.utils.GC;

public class EntityBuilder {

	public String buildEntity(DXFEntity entity){
		String dxfEntity = "";
		
		dxfEntity += GC.ZERO + "\r\n";
		dxfEntity += entity.getType() + "\r\n";
		dxfEntity += GC.LAYER + "\r\n";
		dxfEntity += entity.getLayer() + "\r\n";
		
		return dxfEntity;
	}
	
}
