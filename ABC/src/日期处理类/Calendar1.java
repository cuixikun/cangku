package 日期处理类;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String args[]) throws Exception{
		Calendar cal = Calendar.getInstance();//取得本类对象
		StringBuffer buf = new StringBuffer();
		buf.append(cal.get(Calendar.YEAR)).append("-");
		buf.append(cal.get(Calendar.MONTH)+1).append("-");//月份从0开始计算，所以+1
		buf.append(cal.get(Calendar.DAY_OF_MONTH)).append(" ");
		buf.append(cal.get(Calendar.HOUR_OF_DAY)).append(":");
		buf.append(cal.get(Calendar.MINUTE)).append(":");
		buf.append(cal.get(Calendar.SECOND));
		System.out.println(buf);
	}

}
