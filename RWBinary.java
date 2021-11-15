package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RWBinary {
	public static void main(String[] args) throws Exception {
	String src = "D:\\java ex file/source.jpg" 	;
	String trgt = "D:\\java ex file/target.jpg" 	;
	FileInputStream in = new FileInputStream(src);
	FileOutputStream out = new FileOutputStream(trgt);	

	System.out.println("Done");
	out.close();
	in.close();
		
	}
	

}
