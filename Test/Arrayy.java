package Test;

import java.util.Scanner;

public class Arrayy {
	int a[] = new int[5];
	int i;
	Scanner scan = new Scanner(System.in);
	void compute()
	{
		System.out.println("Enter the array elements");
		for(i=0;i<5;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
				a[i]=(a[i]*a[i]);
			}
		}
		System.out.println("the elements are");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Arrayy aa = new Arrayy();
		aa.compute();
	}
}
