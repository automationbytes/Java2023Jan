package Day6;

import java.util.TreeSet;

public class TreeSet_Eg {
	public static void main(String[] args) {

		
		TreeSet hs = (TreeSet) new TreeSet().descendingSet();
		hs.add(7);
		hs.add(5);
		hs.add(3);
		hs.add(7);
		hs.add(9);
		hs.add(-7);
		
		System.out.println(hs);
		
	}
}
