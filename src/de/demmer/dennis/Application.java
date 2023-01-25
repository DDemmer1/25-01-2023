package de.demmer.dennis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		try {
			
			FileInputStream fistream = new FileInputStream("files/faust.txt");
			InputStreamReader stream = new InputStreamReader(fistream,"UTF-8");

			int temp = stream.read();
			while(temp >= 0) {
				System.out.print((char)temp);
				temp = stream.read();
			}
			
			stream.close();
			
			
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		
	

	}

}
