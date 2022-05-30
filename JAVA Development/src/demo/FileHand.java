package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHand {

	public static void main(String[] args) {
			File file = new File("Text.file");
			
			try {
				FileReader fr = new FileReader(file);
				System.out.println("file can be read");
			} catch (FileNotFoundException e) {
			 System.out.println("File not found"); 
			}
			System.out.println("Finished");

		}

	}
	
		
