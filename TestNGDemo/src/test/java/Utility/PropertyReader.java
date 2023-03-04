package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	static String readProperty(String Key) throws IOException {
		String val = null;
		
			FileInputStream file = new FileInputStream("src/test/java/Resources/config.properties");
			Properties prop = new Properties();
			prop.load(file);
			val = prop.getProperty(Key);
			//System.out.println();
		
		return val;
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(readProperty("title"));
	
		
	}
}
