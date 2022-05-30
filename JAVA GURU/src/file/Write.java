package file;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Text.file");
			writer.write("This is a good text file. ");
			writer.close();
		} catch (IOException e) {
			System.out.println("File cannot be read. ");
			e.printStackTrace();
		}
		

	}

}
