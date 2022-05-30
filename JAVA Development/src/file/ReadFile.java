package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("T.file");
		try {
			Scanner Reader = new Scanner(file);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured while trying to locate the file. ");
			e.printStackTrace();
		}

	}

}
