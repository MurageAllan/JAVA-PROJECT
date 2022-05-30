package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {

	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("Fle not found.");
		}

	}
	public static void openFile() throws FileNotFoundException {
		File file = new File("text.file");
		FileReader fr = new FileReader(file);
	}

}
