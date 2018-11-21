package Test;
public class Methods {
	void print()
	{
		System.out.println("hii");
	}
	int dispaly()
	{
		int a=5;
		return a;
	}
	void disply(int b)
	{
		System.out.println(b);
	}
    public static void main(String[] args) {
		Methods m = new Methods();
		m.print();
		int b = 0;
		m.disply(b);
		m.print();
		
	}

}
