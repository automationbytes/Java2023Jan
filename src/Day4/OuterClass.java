package Day4;

public class OuterClass {
	
	static int num = 10;
	
	static class inner {
		
		int getnum() {
			return num;
			
		}
		
		static int getnum1() {
			return num;
			
		}
		public static void main(String[] args) {
			OuterClass.inner o = new OuterClass.inner();
			System.out.println(o.getnum());
			OuterClass.inner.getnum1();
			
			
			
		}
		
	}
}
