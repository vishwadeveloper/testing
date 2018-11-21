package Collectionss;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class SetExample {
	public static void main(String[] args) {
		Set<Movie> hash_set = new HashSet<Movie>();
		Set<String> hash_sett = new HashSet<String>();
		Movie msp = new Movie("masterpiece", "laxmi", 100, "6:00 to 9:00");
		Movie mspp = new Movie("masterpiece", "laxmi", 100, "6:00 to 9:00");
	    hash_set.add(msp);
	    hash_set.add(mspp);
	    hash_sett.add("hii");
	    hash_sett.add("hii");
	    hash_sett.add("aa");
	    System.out.println(hash_sett);
	    String ss = "hlo";
	    List<String> abc= new ArrayList();
	    abc.add("hii");
	    hash_sett.removeAll(abc);
	    System.out.println(hash_sett);
	    TreeSet<String> tree_set = new TreeSet<String>();
	    tree_set.add("hii");
	    tree_set.add("hii");
	    tree_set.add("abc");
	    tree_set.add("zml");
	    tree_set.add("pa");
	    tree_set.toArray();
	    System.out.println(tree_set.ceiling(ss));
	    System.out.println(tree_set.clone());
	    System.out.println(tree_set);
	    System.out.println(tree_set.descendingIterator());
	    System.out.println( tree_set.iterator().toString());
	    System.out.println(tree_set.first());
	    System.out.println(tree_set.floor(ss));
	}

}
