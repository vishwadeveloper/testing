package multithreading;

public class Multit1 extends Thread{
	public void run()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Multit1 m = new Multit1();
		m.run();
		int cc = Multit1.activeCount();
		System.out.println(cc);
	}

}
