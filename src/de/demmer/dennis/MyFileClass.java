package de.demmer.dennis;

import java.io.File;
import java.io.FileNotFoundException;

public class MyFileClass {
	
	
	public MyFileClass(String path) throws FileNotFoundException{
		
		File file = new File(path);
		
		if(!file.exists()) {
			throw new FileNotFoundException();
		}
		
	}
	
	

}
