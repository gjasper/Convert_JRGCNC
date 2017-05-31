package br.com.jaraguacnc.joiner;

import br.com.jaraguacnc.dxfmodel.DXFEntity;
import br.com.jaraguacnc.dxfmodel.DXFLine;
import br.com.jaraguacnc.dxfmodel.DXFVertex;
import br.com.jaraguacnc.dxfmodel.EXTD_DXFBulge;
import br.com.jaraguacnc.utils.Consts;

public class VertexAdapter {

	VertexLineAdapter vertexLineAdapter = new VertexLineAdapter();
	VertexBulgeAdapter vertexBulgeAdapter = new VertexBulgeAdapter();
	
	public DXFVertex convertEndCoord (DXFEntity entity){
		
		DXFVertex vertex = new DXFVertex();
		
		switch(entity.getType()){
			case Consts.DXF_TYPE_LINE:
				return vertexLineAdapter.convertEndCoord((DXFLine) entity);
			case Consts.EXTD_DXF_BULGE:
				return vertexBulgeAdapter.convertEndCoord((EXTD_DXFBulge) entity);
		}
		
		return vertex;
		
	}
	
	public DXFVertex convertStartCoord (DXFEntity entity){
		
		DXFVertex vertex = new DXFVertex();
		
		switch(entity.getType()){
			case Consts.DXF_TYPE_LINE:
				return vertexLineAdapter.convertStartCoord((DXFLine) entity);
			case Consts.EXTD_DXF_BULGE:
				return vertexBulgeAdapter.convertStartCoord((EXTD_DXFBulge) entity);
		}
		
		return vertex;
		
	}
	
}
