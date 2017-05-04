package br.com.jaraguacnc.dxfwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class DXFWriter {

	public boolean write(String dxf, String filePath){
		
		try{
		    PrintWriter writer = new PrintWriter(filePath, "UTF-8");
		    writer.print(dxf);
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
		
		return true;
	}
	
}
