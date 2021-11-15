package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RdKBoard {
	
	public static void main(String[] args) throws Exception {
		
		PrintWriter out = new PrintWriter("D:\\java ex file/rdkbrd.txt");
		
		InputStreamReader kb = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(kb);
		
		String line = in.readLine();
		while (line != "Quit") {
			
		
			out.println(line);
			line = 
		}
		
	}

}
