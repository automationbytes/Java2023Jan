package Day5;

class student{
	private String schoolname = "Oxford international school";

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	
}


public class Encapsulation {
	public static void main(String[] args) {
		student s = new student();
		s.setSchoolname("Public School");
		System.out.println(s.getSchoolname());
	}
}
