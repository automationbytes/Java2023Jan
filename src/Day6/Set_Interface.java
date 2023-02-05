package Day6;

import java.util.HashSet;

public class Set_Interface {
public static void main(String[] args) {
	//Hashset
	HashSet hs = new HashSet();
	hs.add(7);
	hs.add(5);
	hs.add(3);
	hs.add(7);
	hs.add("hi");
	hs.add("sun");
	hs.add("moon");
	System.out.println(hs);

	
	hs.remove("hi");
	System.out.println(hs);
	
	System.out.println(hs.size());
}
}
