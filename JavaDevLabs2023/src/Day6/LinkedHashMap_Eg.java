package Day6;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap_Eg {
public static void main(String[] args) {
	//it will maintain insertion order
	
	LinkedHashMap<String, String>  map = new LinkedHashMap<String, String> ();
	map.put("1","one");
	map.put("5","five");
	map.put("8","eight");
	map.put("2","two");
	map.put("1","one");
	
	System.out.println(map);
}
}
