package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Handler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStream input = null;
		OutputStream output = null;
		boolean fileNotFound = true;
		
		File f1, f2;
		while(fileNotFound){
			try{
				System.out.println("Input File Name?");
				f1 = new File(sc.nextLine());
				input = new FileInputStream(f1);
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist with that name. Try again.");
			}
			fileNotFound = false;
		}
		
		fileNotFound = true;
		while(fileNotFound){
			try{
				System.out.println("Output File Name?");
				f2 = new File(sc.nextLine());
				output = new FileOutputStream(f2);
			} catch (FileNotFoundException e){
				System.out.println("Output file does not exist with that name. Try again.");
			}
			fileNotFound = false;
		}
		
		byte[] buffer = new byte[1024];
		int bytesRead;
		try {
			while ((bytesRead = input.read(buffer))> 0) {
				output.write(buffer, 0, bytesRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
