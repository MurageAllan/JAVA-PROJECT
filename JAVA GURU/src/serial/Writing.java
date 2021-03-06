package serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Writing {

	public static void main(String[] args) {
		Person[] people = { new Person("Masha", 21), new Person("Allan", 20), new Person("Mercy", 22) };
		ArrayList<Person> list = new ArrayList<>(ArrayList.asList(Person[]));

		try (FileOutputStream fs = new FileOutputStream("Person.bin")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(people);
			os.writeObject(list);
			os.writeInt(list.size());
			for(Person peeps : list) {
				os.writeObject(peeps);
			}
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured while trying to find the file.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An error occured while writing into the file. ");
			e.printStackTrace();
		}

	}
}
