package Stringg;

import java.util.Scanner;

public class Stringtest3 {
	public static void main(String[] args) {
		char a[] = new char[20];
		int n=0;
		String s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		s=scan.next();
		for(int i=0;i<s.length();i++)
		{
			a[i] = s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			if(a[i]=='a')
			{
				
			}
			else if(a[i]=='e')
			{
				
			}
			else if(a[i]=='i')
			{
				
			}
			else if(a[i]=='o')
			{
				
			}
			else if(a[i]=='u')
			{
				
			}
			else
			{
				n=n+1;
			}
			
		}
		System.out.println("number of consonent is"+n);
	}

}
