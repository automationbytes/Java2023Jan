package Day6;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap_Eg {
public static void main(String[] args) {
	
	//treemap - can stre ascending/descending
	Map<String,String>  map = new TreeMap<String, String> ().descendingMap();
	map.put("1","one");
	map.put("5","five");
	map.put("8","eight");
	map.put("2","two");
	map.put("1","one");
	
	System.out.println(map);
}
}
