package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions_Eg {
	public static void main(String[] args) throws IOException, InterruptedException {

		//run time exceptions - unchecked exceptions
//		int a = 5;
//		System.out.println(a/0);
//		
//		
		String a = null;
		System.out.println(a.length());
		
		System.out.println("Hello");
		
		
//		int[] arr = {1,2};
//		System.out.println(arr[3]);
		
		//compile time exception - checked exception
	FileInputStream file = new FileInputStream("c:/1.txt");	
	file.read();
	Thread.sleep(5000);
	}
}
