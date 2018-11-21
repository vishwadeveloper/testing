package Exceptionhandling;

import java.util.Scanner;

public class OwnException extends Exception{
	String name;
	static int age;
	Scanner scan = new Scanner(System.in);
	OwnException()
	{
		
	}
	OwnException(String str)
	{
		super(str);
	}
	void input()
	{
		System.out.println("Enter your name");
		name=scan.next();
		System.out.println("Enter your age");
		age=scan.nextInt();
	}
	public static void main(String[] args) {
		OwnException own = new OwnException();
		own.input();
		try {
			
			if(age>=18)
			{
				System.out.println("Wlecome to voter id application , u r eligible for voting");
			}
			else
			{
				OwnException o = new OwnException("minimum age for voting is 18"); 
				throw o;
			}
		}
		catch(OwnException e)
		{  
			System.out.println(e);
		}
	}

}
