import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File file = new File("Text.file");
		if(file.delete()) {
			System.out.println("Delete this file. ");
		}else{
			System.out.println("Failed in deleting the file.");
		}

	}

}
