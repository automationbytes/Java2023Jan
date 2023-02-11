package Day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {

		File file = new File("src/Day7/New.txt");
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (file.delete()) {
			System.out.println("Deleted successfully");
		}
		else {
			System.out.println("error");
		}
	}
}
