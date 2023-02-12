package Day6;

import java.util.HashMap;

public class Map_Eg {
	public static void main(String[] args) {

		//key-  will not hav duplicate
		//value - can be duplicated
		//put instead of add method
		
		HashMap map = new HashMap();
		map.put("1","one");
		map.put("5","five");
		map.put("8","eight");
		map.put("2","two");
		map.put("1","one");
		System.out.println(map);
		
		HashMap map2 = (HashMap) map.clone();
		System.out.println(map2);
		
		
		map2.clear();
		System.out.println(map2);
		
		System.out.println(map.containsKey("1"));
		
		System.out.println(map.containsValue("one"));
		
		
		System.out.println(map.get("8"));
		
		map.remove("8");
		System.out.println(map);
		
		map.replace("1", "one", "ONE");
		System.out.println(map);
		
		
	}
}
