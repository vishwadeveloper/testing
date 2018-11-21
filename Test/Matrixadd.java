package Test;

import java.util.Scanner;

public class Matrixadd {
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int sum[][] = new int[3][3];
	Scanner scan = new Scanner(System.in);
	void intput()
	{
		System.out.println("Enter the first matrix elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the second matrix elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
	}
	void compute()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	void output()
	{
		System.out.println("The sum is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(sum[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		Matrixadd m = new Matrixadd();
		m.intput();
		m.compute();
		m.output();
	}

}
