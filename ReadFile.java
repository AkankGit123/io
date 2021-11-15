package com.rays.io;

import java.io.File;
import java.util.Date;

public class ReadFile {
	
	public static void main(String[]args) {
		File f = new File("D:\\java ex file/hello.txt");
		if(f.exists()) {
			System.out.println("Name of the file is: " + f.getName());
			
			System.out.println("Path where file is" + f.getAbsolutePath());
			
			System.out.println("can file is writable :" + f.canWrite());
			System.out.println("can file is Readable :" + f.canRead());
			
			System.out.println("is this a file: " + f.isFile());
			System.out.println("is this a Directory: " + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("What is the last modified date : " + d);
			long len = f.length();
			System.out.println("what is the length of file:" + len + "bytes");
			
		}else {
			System.out.println("File does not exist");
		}
		
		
		
	}

}
