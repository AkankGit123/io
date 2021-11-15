package com.rays.io;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTextFile {
public static void main(String[] args) throws Exception {
	FileWriter wr = new FileWriter("D:\\java ex file/write.txt");
	BufferedWriter br = new BufferedWriter(wr);
	char[] cArray = {'h' , 'i' };
	br.write(cArray);
	br.write(',');
	br.write("Akanksha Rawal");
	br.close();
	System.out.println("Insertion done");
}

}
