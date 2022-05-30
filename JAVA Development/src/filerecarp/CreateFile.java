package filerecarp;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file = new File("Text.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("The file name is " + file.getName());
				System.out.println("The file is now existing " + file.exists());
				System.out.println("The file can be read " + file.canRead());
				System.out.println("The file is writable " + file.canWrite());
				System.out.println("The file size is "+ file.length());
				System.out.println("The file's absolute path is "+ file.getAbsolutePath());
			}else {
				System.out.println("The file already exist.");
			}
		} catch (IOException e) {
			System.out.println("There was an error while creating the new file.");
			e.printStackTrace();
		}

	}

}
