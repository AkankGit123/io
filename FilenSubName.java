package com.rays.io;

import java.io.File;

public class FilenSubName {

	public static void main(String[] args) {
		File directory = new File("D:/java ex file");
		String[] files = directory.list();
		for(String f : files) {
			System.out.println(f);
		}
		
		File subDir = new File(directory, "newText");
		subDir.mkdir();
		File f = new File("D:\\java ex file/1.txt");
		File f1 = new File("D:\\java ex file/11.txt");
		File f2 = new File("D:\\java ex file/12.txt");
		
		f.renameTo(new File("D:\\java ex file/2.txt"));
		f.delete();
		f.deleteOnExit();
		
	}
}
