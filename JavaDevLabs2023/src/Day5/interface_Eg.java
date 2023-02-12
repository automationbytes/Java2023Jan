package Day5;

interface mobile{
	
	default void msg() {
		System.out.println("default");
	}
	
	static void display() {
		System.out.println("static");
	}
	
	void sms();
	void call();
}

interface camera{
	void photo();
	void video();
}

class apple implements mobile,camera{

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("Apple sms");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Apple call");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("Apple photo");
	}

	@Override
	public void video() {
		// TODO Auto-generated method stub
		System.out.println("Apple video");
	}
	
}

class samsung implements mobile{

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("Samsung sms");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Samsung call");
	}
	

}
public class interface_Eg {

	public static void main(String[] args) {
		
		samsung s = new samsung();
		s.call();
		s.sms();
		s.msg();
		mobile.display();
		apple a = new apple();
		a.call();
		a.sms();
		
	}
}
