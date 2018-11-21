package Stringg;

import java.util.Scanner;

public class Stringtest {
	public static void main(String[] args) {
		String st  ;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the string");
	    st = scan.next();
	    for(int i=0;i<1;i++)
		{
			
			st = st.replace("a", "z");
			st = st.replace("e", "z");
			st = st.replace("i", "z");
			st = st.replace("o", "z");
			st = st.replace("u", "z");
			System.out.println(st);
			
		}
		
		}

}
