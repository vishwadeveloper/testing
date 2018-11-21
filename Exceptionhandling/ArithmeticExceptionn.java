package Exceptionhandling;

public class ArithmeticExceptionn {
	public static void main(String[] args) {
		try {
			int a=20,b=0,c;
			c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("occured Exception is"+e);
		}
	}

}
