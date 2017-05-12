package br.com.jaraguacnc.joiner;

import br.com.jaraguacnc.dxfmodel.DXFEntity;
import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.dxfmodel.DXFVertex;
import br.com.jaraguacnc.utils.Consts;

public class VertexAdapter {

	public DXFVertex marshall (DXFEntity entity){
		
		DXFVertex vertex = new DXFVertex();
		VertexLineAdapter vertexLineAdapter = new VertexLineAdapter();
		
		switch(entity.getType()){
			case Consts.DXF_TYPE_LINE:
				return vertexLineAdapter.marshall((DXFLine) entity);
		}
		
		return vertex;
		
	}
	
	public DXFVertex firstVertex (DXFEntity entity){
		
		DXFVertex vertex = new DXFVertex();
		VertexLineAdapter vertexLineAdapter = new VertexLineAdapter();
		
		switch(entity.getType()){
			case Consts.DXF_TYPE_LINE:
				return vertexLineAdapter.firstVertex((DXFLine) entity);
		}
		
		return vertex;
		
	}
	
}
