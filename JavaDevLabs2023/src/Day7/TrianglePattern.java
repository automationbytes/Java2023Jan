package Day7;

public class TrianglePattern {
	public static void main(String[] args) {
//		int size = 7;
//		for(int i = 1; i<=size;i++) {
//			for(int j = size -1; j>0;j--) {
//				System.out.print(" ");
//			}
//			for(int k = 1 ; k<=i;k++) {
//				System.out.print(i);
//			}
//			System.out.print("\n");
//		}
		
	    int rows = 5;

	    for (int i = 1; i <= rows; i++) {
	      for (int j = rows-i; j>0;j--) {
	        System.out.print("  ");
	      }
	      for(int k = 1; k<= 2*i-1;k++) {
	     // while (k != 2 * i - 1) {
	        System.out.print(" "+i);
	     //   ++k;
	      }
	      System.out.println();

	    }
	}
}
