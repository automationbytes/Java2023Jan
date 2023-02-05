package Day6;

import java.util.LinkedHashSet;

public class LinkedHashSet_Eg {
	public static void main(String[] args) {

		//without duplicates
		//insertion order
		
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(7);
		hs.add(5);
		hs.add(3);
		hs.add(7);
		hs.add(9);
		hs.add(-7);
		
		System.out.println(hs);
		
	}
}
