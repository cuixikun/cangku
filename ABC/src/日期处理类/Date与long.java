package ���ڴ�����;

import java.util.Date;

public class Date��long {
	public static void main(String args[]) throws Exception{
		long cur=System.currentTimeMillis();//ȡ�õ�ǰ������long�ͷ���
		Date date=new Date(cur);
		System.out.println(date);
		System.out.println(date.getTime());
	}

}
