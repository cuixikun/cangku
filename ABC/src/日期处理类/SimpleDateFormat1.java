package ���ڴ�����;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat1 {
	public static void main(String args[]) throws Exception{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss.SSS");
		String str=sdf.format(date);//Date��ת����String��
		System.out.println(str);
	}

}
