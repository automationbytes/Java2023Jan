package Day4;

public class WithStatic {

	static int num = 1;
	
	WithStatic(){
		num++;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		WithStatic a = new WithStatic();//1
		WithStatic b = new WithStatic();//2
		WithStatic c = new WithStatic();//3
		
		//1 memory
	}

}
