package Stringg;

import java.util.Scanner;

public class Stringtest2 {
	public static void main(String[] args) {
		int n;
		String st  ;
		String ss  ;
		String str  ;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the string");
	    st = scan.next();
	    n = st.length();
	    ss = st.substring(4, 5);
	     str = st.substring((n-1));
	     st = st.replace(ss, str);
	     System.out.println(st);
	   
	   
	}

}
