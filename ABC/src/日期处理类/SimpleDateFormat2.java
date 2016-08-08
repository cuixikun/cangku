package 日期处理类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat2 {
	public static void main(String args[]) throws Exception{
		String str="2016-08-08 11:11:11.111";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date date=sdf.parse(str);//将字符串变为日期型数据
		System.out.println(date);
	}

}
