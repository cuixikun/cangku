package ���ڴ�����;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String args[]) throws Exception{
		Calendar cal = Calendar.getInstance();//ȡ�ñ������
		StringBuffer buf = new StringBuffer();
		buf.append(cal.get(Calendar.YEAR)).append("-");
		buf.append(cal.get(Calendar.MONTH)+1).append("-");//�·ݴ�0��ʼ���㣬����+1
		buf.append(cal.get(Calendar.DAY_OF_MONTH)).append(" ");
		buf.append(cal.get(Calendar.HOUR_OF_DAY)).append(":");
		buf.append(cal.get(Calendar.MINUTE)).append(":");
		buf.append(cal.get(Calendar.SECOND));
		System.out.println(buf);
	}

}
