package Stringg;

public class Maintest {
	public static void main(String... args) {
		int count=0;
		String s1="aparna";
		for(int i=0;i<s1.length();i++) {
			
			if((s1.charAt(i)!='a')&&(s1.charAt(i)!='e')&&(s1.charAt(i)!='i')&&(s1.charAt(i)!='o')&&(s1.charAt(i)!='u')) {
				count=count+1;
				
		}
	}
		System.out.println(count);
		
}
}