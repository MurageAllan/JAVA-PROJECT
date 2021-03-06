package frameworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) {
		Movie mv1 = new Movie(2002, "Knight");
		Movie mv2 = new Movie(2000, "Into the Badlands");
		Movie mv3 = new Movie(2003, "Fauda");
		Movie mv4 = new Movie(2010, "Ben Air");
		Movie mv5 = new Movie(2011, "Ginny and Georgia");

		List<Movie> list = new ArrayList<>();
		Map<Movie, Integer> map = new HashMap<>();
		SortedSet<Movie> set = new TreeSet<>();
		
		addElements(list);
		addElements(set);
	
		Collections.sort(list);
		Collections.sort(list, new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		showElements(list);
		System.out.println("\n");
		showElements(set);

	}

	public static void addElements(Collection<Movie> col) {
		col.add(new Movie(2002, "Knight"));
		col.add(new Movie(2000, "Into the Badlands"));
		col.add(new Movie(2003, "Fauda"));
		col.add(new Movie(2010, "Ben Air"));
		col.add(new Movie(2011, "Ginny and Georgia"));
	}
	public static  void showElements(Collection<Movie> structure) {
		for(Movie value : structure) {
			System.out.println(value);
		}
	}
}

class Movie implements Comparable<Movie> {
	private int date;
	private String name;

	public Movie(int date, String name) {
		this.name = name;
		this.date = date;
	}

	public String toString() {
		return String.format("%d , %s", date, name);
	}

	@Override
	public int compareTo(Movie movie) {
		if(name.length() > movie.name.length()) {
			return 1;
		}else if(name.length() < movie.name.length()) {
			return -1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(name, other.name);
	}
}
