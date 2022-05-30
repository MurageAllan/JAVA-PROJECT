package filerecarp;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File file = new File("Text.txt");
		if(file.delete()) {
			System.out.println("The file has been deleted successfully.");
		}else {
			System.out.println("The file could not be deleted.");
		}
		

	}

}
