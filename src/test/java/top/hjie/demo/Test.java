package top.hjie.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends Thread{

	public static void main(String[] args) throws ParseException {
		Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2013-08-06 21:02:07");
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(parse));
	}
	
	
	
}
