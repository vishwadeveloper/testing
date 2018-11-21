package Stringg;

public class strpractice {
	public static void main(String[] args) {
		String s = "vishu";
		String ss = "VISHWA";
		String st = new String("vishwa");
		System.out.println("lenth is"+st.length());
		System.out.println(st.substring(1, 4));
		System.out.println(st.endsWith("a"));
		System.out.println(st.endsWith(s));
		System.out.println(st.substring(1));
		System.out.println(st.charAt(2));
		System.out.println(st.startsWith(s));
		System.out.println(st.charAt(3));
		System.out.println(st.endsWith("s"));
		System.out.println(st.chars());
		System.out.println(st.contains("vishwa"));
		System.out.println(st.equals(s));
		System.out.println(st.concat("vishu"));
		System.out.println(st.replace('w', 'a'));
		System.out.println( s.replace("u", "wa"));
		System.out.println( st.equalsIgnoreCase(ss));
		System.out.println(st.split(""));
	}

}
