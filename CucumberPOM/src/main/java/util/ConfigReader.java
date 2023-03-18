package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public Properties prop;
	
	public String getConfigProperty(String key) {
		prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("src/test/resources/Config.Properties");
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
}
