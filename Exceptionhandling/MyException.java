package Exceptionhandling;
import java.util.Scanner;
public class MyException extends OwnException{
	 static int accno[] = {1001, 1002, 1003, 1004}; 
	  static int accflag=0,i;
 static String namee[] = 
	                 {"vishwa", "Sachin", "Sharath", "Abhi", "Akash"}; 
	  
 static double ball[] = 
	         {10000.00, 12000.00, 5600.0, 999.00, 1100.55}; 
	static String name;
	static int acc;
	  
	Scanner scan = new Scanner(System.in);
	void input()
	{
		System.out.println("Enetr your account number");
		acc=scan.nextInt();
	}


	public static void main(String[] args) {
		MyException m = new MyException();
		m.input();
		try {
				for( i=0;i<5;i++)
				{
					if(accno[i]==acc)
					{
						accflag=1;
						break;
					}
				}
				if(accflag==1)
				{
					if(ball[i]>1000)
					{
							System.out.println("your name is"+namee[i]);
							System.out.println("your account number is"+accno[i]);
							System.out.println("Your balance is"+ball[i]);
						
					}
					else
					{
							System.out.println("your name is"+namee[i]);
							System.out.println("your account number is"+accno[i]);
							System.out.println("Your balance is"+ball[i]);
							OwnException ow = new OwnException("Your balance is less than 1000");
							throw ow;		
					}
				}
				else
				{
					OwnException o = new OwnException("Account number doesnt exist");
					throw o;
				}
			}
			catch(OwnException e)
			{
				System.out.println(e);
			}
		
		}
}



