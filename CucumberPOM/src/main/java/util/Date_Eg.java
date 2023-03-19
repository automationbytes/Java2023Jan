package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Eg {
public static void main(String[] args) {
	String pattern = "yyyy/MM/dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	String date = simpleDateFormat.format(new Date());
	System.out.println(date);
}
}
