package br.com.jaraguacnc.dxfwriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import br.com.jaraguacnc.dxfbuilder.DXFBuilder;
import br.com.jaraguacnc.dxfmodel.WrappedDXF;
import br.com.jaraguacnc.utils.UiConsts;

public class DXFWriter {

	public boolean write(WrappedDXF wrappedDXF, String rootPath) throws Exception{
		
		DXFBuilder builder = new DXFBuilder();
		
		try{	    
		    File file = new File(rootPath + wrappedDXF.getFullPath());
		    file.getParentFile().mkdirs();
		    FileWriter writer = new FileWriter(file);
		    writer.write(builder.build(wrappedDXF.getDxf()));
		    writer.close();
		} catch (IOException e) {
			throw new Exception(UiConsts.ERROR_WRITING + e.getMessage());
		}
		
		return true;
	}
	
}
