package br.com.jaraguacnc.joiner;

import java.util.Map;
import java.util.Map.Entry;

import br.com.jaraguacnc.dxfmodel.DXF;
import br.com.jaraguacnc.dxfmodel.DXFPolyline;
import br.com.jaraguacnc.utils.Consts;

public class Joiner {

	VertexAdapter vertexAdapter;	
	DXF outputDXF;
	
	public DXF join (DXF inputDXF, Map <Integer, Integer> continuityMap){
		
		
		vertexAdapter = new VertexAdapter();
		outputDXF = new DXF();
		DXFPolyline polyline = new DXFPolyline();
				
		for(Entry<Integer, Integer> entry : continuityMap.entrySet()){	
			switch(entry.getValue()){
				case Consts.CONTINUITY_START:
					polyline = new DXFPolyline(inputDXF.getEntities().get(entry.getKey()).getLayer());
					polyline.getVertexList().add(vertexAdapter.convertStartCoord(inputDXF.getEntities().get(entry.getKey())));
					polyline.getVertexList().add(vertexAdapter.convertEndCoord(inputDXF.getEntities().get(entry.getKey())));
				break;
				case Consts.CONTINUITY_MID:
					polyline.getVertexList().add(vertexAdapter.convertStartCoord(inputDXF.getEntities().get(entry.getKey())));
				break;
				case Consts.CONTINUITY_END:
					polyline.getVertexList().add(vertexAdapter.convertStartCoord(inputDXF.getEntities().get(entry.getKey())));
					outputDXF.getEntities().add(polyline);
				break;
				case Consts.CONTINUITY_NOT:
					outputDXF.getEntities().add(inputDXF.getEntities().get(entry.getKey()));
				break;
			}
		}
				
		outputDXF.setTables(inputDXF.getTables());
		
		return outputDXF;
	}
	
}
