package Day7;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {

		File file = new File("src/Day7/New.txt");

		try {
			file.createNewFile();
			
			System.out.println("FileName -> " + file.getName());

			System.out.println("getAbsolutePath-> " + file.getAbsolutePath());

			System.out.println("getCanonicalPath-> " + file.getCanonicalPath());

			System.out.println("getPath-> " + file.getPath());

			//	System.out.println(file.length());


		}catch(Exception e){
			e.printStackTrace();
		}
		//(file.exists()) {

		//}

	}

}
