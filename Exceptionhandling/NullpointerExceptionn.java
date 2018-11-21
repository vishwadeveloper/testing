package Exceptionhandling;

public class NullpointerExceptionn {
	public static void main(String[] args) {
		try {
			String v = null;
			System.out.println(v.charAt(0));
			
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer exception"+e);
		}
	}

}
