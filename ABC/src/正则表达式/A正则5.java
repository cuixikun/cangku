package 正则表达式;


import java.text.SimpleDateFormat;
import java.util.Date;

public class A正则5 {
	public static void main(String args[]) throws Exception{
		String str="2016-08-08";
		String regex="\\d{4}-\\d{2}-\\d{2}";
		System.out.println(str.matches(regex));
		if(str.matches(regex)){
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
			System.out.println(date);
		}
	}

}
