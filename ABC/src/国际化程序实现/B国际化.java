package ���ʻ�����ʵ��;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class B���ʻ� {
	public static void main(String args[]) throws Exception{
		Locale loc = new Locale("en","US");
		ResourceBundle rb = ResourceBundle.getBundle("Messages",loc);
		String str = rb.getString("wel.msg");//�߱���ռλ��������
		System.out.println(MessageFormat.format(str,"����" ));
		
	}

}
