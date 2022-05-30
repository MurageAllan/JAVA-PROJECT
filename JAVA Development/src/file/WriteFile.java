package file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("T.file");
			file.write("Allan has been employed by google before. This automatically qualify him to be in this team");
			file.close();
		} catch (IOException e) {
			System.out.println("An error ocurred while trying to write to the file. ");
			e.printStackTrace();
		}
		

	}

}
