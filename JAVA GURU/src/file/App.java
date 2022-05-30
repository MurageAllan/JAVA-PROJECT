package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args)  {
		File file = new File("Text.file");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null){
			System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be found error" + file.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File cannot be read. ");
			e.printStackTrace();
		}
		finally {
		try {
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		catch(NullPointerException ex) {
			System.out.println("The close method is null");
		}
		}
	}
}
