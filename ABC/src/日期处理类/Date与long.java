package 日期处理类;

import java.util.Date;

public class Date与long {
	public static void main(String args[]) throws Exception{
		long cur=System.currentTimeMillis();//取得当前日期以long型返回
		Date date=new Date(cur);
		System.out.println(date);
		System.out.println(date.getTime());
	}

}
