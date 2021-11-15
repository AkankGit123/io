package com.rays.io;

import java.io.FileReader;

public class ReadChar {
	
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("D:\\java ex file/hello.txt");
		
		//read char as ASCII or Unicode
		
		int ch = reader.read();
		
		//ch is -1 if no char in file
		
		while(ch != -1) {
			char chr = (char) ch; //type cast to char
			System.out.println(chr);
			ch = reader.read();
		}
		reader.close();
	}

}
