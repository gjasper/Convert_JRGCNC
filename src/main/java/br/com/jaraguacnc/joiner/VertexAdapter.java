package br.com.jaraguacnc.joiner;

import br.com.jaraguacnc.dxfmodel.DXFEntity;
import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.dxfmodel.DXFVertex;
import br.com.jaraguacnc.dxfmodel.EXTD_DXFBulge;
import br.com.jaraguacnc.utils.Consts;

public class VertexAdapter {

	VertexLineAdapter vertexLineAdapter = new VertexLineAdapter();
	VertexBulgeAdapter vertexBulgeAdapter = new VertexBulgeAdapter();
	
	public DXFVertex marshallEndCoord (DXFEntity entity){
		
		DXFVertex vertex = new DXFVertex();
		
		switch(entity.getType()){
			case Consts.DXF_TYPE_LINE:
				return vertexLineAdapter.marshallEndCoord((DXFLine) entity);
			case Consts.EXTD_DXF_BULGE:
				return vertexBulgeAdapter.marshallEndCoord((EXTD_DXFBulge) entity);
		}
		
		return vertex;
		
	}
	
	public DXFVertex marshallStartCoord (DXFEntity entity){
		
		DXFVertex vertex = new DXFVertex();
		
		switch(entity.getType()){
			case Consts.DXF_TYPE_LINE:
				return vertexLineAdapter.marshallStartCoord((DXFLine) entity);
			case Consts.EXTD_DXF_BULGE:
				return vertexBulgeAdapter.marshallStartCoord((EXTD_DXFBulge) entity);
		}
		
		return vertex;
		
	}
	
}
