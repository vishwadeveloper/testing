package multithreading;

public class Multithreadd extends Thread{

	public void run()
	{
		System.out.println("thread running");
	}
	
	
	public static void main(String[] args) {
		Multithreadd m = new Multithreadd();
		m.start();
		int c = Multithreadd.activeCount();
		System.out.println(c);
		
	}

}
