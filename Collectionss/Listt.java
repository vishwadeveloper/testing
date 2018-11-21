package Collectionss;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
public class Listt {
	public static void main(String[] args) {
		 List<String> name= new  ArrayList();
		   String e="aa";
			name.add(e);
			name.add("vishwa");
			System.out.println(name.size());
			System.out.println(name.get(1));
			System.out.println(name.contains(0));
			name.add(2, "vishu");
			System.out.println(name.getClass());
			System.out.println(name.iterator());
			name.add("vishu");
			name.add("sharath");
			name.add("chethu");
			name.add("bhatta");
			name.add("pavi");
			name.add("sanju");
			System.out.println(name.size());
			name.remove(e);
			System.out.println(name.size());
			System.out.println(name.isEmpty());
			System.out.println(name.equals(e));
			System.out.println(name.hashCode());
			name.set(3, "vini");
			System.out.println(name.indexOf(e));
			System.out.println(name.listIterator());
			System.out.println(name.lastIndexOf(e));
	        Comparator<? super String> c = null;
			name.sort(c);
	}

}
