package Day6;

import java.util.HashMap;
import java.util.Map;

public class LoopsinMap {
public static void main(String[] args) {
	HashMap<String, String>  map = new HashMap<String, String> ();
	map.put("1","one");
	map.put("5","five");
	map.put("8","eight");
	map.put("2","two");
	map.put("1","one");
	System.out.println(map);

	for(Map.Entry<String, String> entry : map.entrySet()) {
		System.out.println(entry.getKey()+"   "+entry.getValue());
	}
	
	for(String k : map.keySet()) {
		System.out.println(k);
		System.out.println(map.get(k));
	}
	
	map.forEach((k,v)->System.out.println(k+"  "+v));
	
}
}
