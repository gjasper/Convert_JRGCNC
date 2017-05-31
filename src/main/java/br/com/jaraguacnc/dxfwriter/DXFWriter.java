package br.com.jaraguacnc.dxfwriter;

import java.io.IOException;
import java.io.PrintWriter;
import br.com.jaraguacnc.dxfbuilder.DXFBuilder;
import br.com.jaraguacnc.dxfmodel.WrappedDXF;

public class DXFWriter {

	public boolean write(WrappedDXF wrappedDXF, String rootPath){
		
		DXFBuilder builder = new DXFBuilder();
		
		try{
		    PrintWriter writer = new PrintWriter(rootPath + wrappedDXF.getFullPath(), "UTF-8");
		    writer.print(builder.build(wrappedDXF.getDxf()));
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
		
		return true;
	}
	
}
