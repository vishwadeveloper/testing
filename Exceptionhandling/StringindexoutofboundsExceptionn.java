package Exceptionhandling;

public class StringindexoutofboundsExceptionn {
	public static void main(String[] args) {
		try {
			String v = "vishu";
			System.out.println(v.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String length is out of range"+e);
		}
	}

}
