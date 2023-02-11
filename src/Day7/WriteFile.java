package Day7;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {

		//File file = new File("src/Day7/New.txt");
		
		try {
			FileWriter fw = new FileWriter("src/Day7/New.txt");
			fw.write("Java is easy programming language. \nJava is more popular in testing world");
			fw.close();
			
		//	fw.append("\nSelenium uses Java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			FileWriter fw = new FileWriter("src/Day7/New.txt");
//			//fw.write("Java is easy programming language. \n Java is more popular in testing world");
//			
//			fw.append("\nSelenium uses Java");
//			fw.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
