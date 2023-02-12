package Day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Eg {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Java is opensource programming language");
		if(matcher.find()) {
			System.out.println("Match found");
		}else {
			System.out.println("Not Found");
		}
		
	}
}
