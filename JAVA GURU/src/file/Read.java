package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		File file = new File("Text.file");
		try {
			Scanner Reader = new Scanner(file);
			while(Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be read because an error ocurred. ");
			e.printStackTrace();
		}
		

	}

}
