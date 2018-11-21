package Exceptionhandling;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader;
public class Filenotfoundexceptionn {
	public static void main(String[] args) {
		try {
		
		File file = new File("F://html programs");

        FileReader fr = new FileReader(file);
		}
  
	catch(FileNotFoundException f)
	{
		System.out.println("This file is not found "+f);
	}

}

}
