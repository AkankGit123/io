package com.rays.io;


import java.io.FileReader;
import java.util.Scanner;

public class ReadLine {
	public static void main(String[] args) throws Exception {
		FileReader r = new FileReader("D:\\java ex file/hello.txt");
		Scanner sc = new Scanner (r);
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		
		
	}

}
