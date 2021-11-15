package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testEmpSer extends EmployeeSer {
	public static void main(String[] args) throws IOException, Exception {
		
	
	FileOutputStream fOut = new FileOutputStream("D:/serObjfile.ser");
	ObjectOutputStream oOut = new ObjectOutputStream(fOut);
	EmployeeSer eS = new EmployeeSer(101, "Akanksha", "Rawal", "Indore");
	oOut.writeObject(eS);
	oOut.close();
	System.out.println("Insertion done");
	
	
	
	
	FileInputStream fIN = new FileInputStream("D:/serObjfile.ser");
	ObjectInputStream oIn = new ObjectInputStream(fIN);
	EmployeeSer eSr = (EmployeeSer)oIn.readObject();
	System.out.println();
}

	
	
}
