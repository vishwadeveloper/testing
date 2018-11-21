package Exceptionhandling;

public class ArrayindexoutofboundExceptionn {
	public static void main(String[] args) {
		try {
			int[] a = {2,3,4};
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("array index is out of bound"+a);
		}
	}

}
