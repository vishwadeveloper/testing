package Exceptionhandling;

public class NumberformatExceptionn {
	public static void main(String[] args) {
		try {
			 int num = Integer.parseInt ("akki") ; 
			  System.out.println(num);
		}
		catch(NumberFormatException n)
		{
			System.out.println("number format exception "+n);
		}
	}

}
