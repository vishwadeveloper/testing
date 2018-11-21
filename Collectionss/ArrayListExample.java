package Collectionss;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		String ss = null;
		List<Movie> movielist = new ArrayList();
		Movie kgf = new Movie("kgf", "laxmi", 100, "10:00 to 1:00");
		Movie ramachari = new Movie("ramachari", "hpc", 100, "2:00 to 5:00");
		movielist.add(kgf);
		movielist.add(ramachari);
		System.out.println(movielist.contains(kgf));
		System.out.println(movielist.contains(ss));
	}

}
