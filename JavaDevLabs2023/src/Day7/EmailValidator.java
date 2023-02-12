package Day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	static String Email_Regex = "^[a-zA-Z0-9_.]+@[A-Za-z]+\\.[A-Za-z]";
	
	static Pattern pattern = Pattern.compile(Email_Regex, Pattern.CASE_INSENSITIVE);
	
	static boolean validate_email(String email) {
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}
	
	public static void main(String[] args) {

		System.out.println(validate_email("test@gmail.com"));
		
	}


}
