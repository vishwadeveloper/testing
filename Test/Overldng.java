package Test;

public class Overldng extends Methods{
	int b;
	Overldng()
	{
		b=2;
	}
	Overldng(int a)
	{
	
	}
	void print()
	{
		System.out.println("hi");
	}
	void print(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Overldng o = new Overldng();
		Overldng o1 = new Overldng(5);
		int a=5;
		o.print();
		o.print(a);
		
	}

}
