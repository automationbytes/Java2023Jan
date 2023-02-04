package Day5;

public class garbage_collector {

//	public void vv() {
//		System.out.println("collector is called");
//	}
//	
	public static void main(String[] args) {
		garbage_collector g = new garbage_collector();
		garbage_collector g1 = new garbage_collector();
		
		//g = null;
		System.gc();
		
	}
	
}
