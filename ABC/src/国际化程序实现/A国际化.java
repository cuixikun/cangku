package ���ʻ�����ʵ��;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
public class A���ʻ� {
	public static void main(String args[]) throws Exception{
		ResourceBundle rb = ResourceBundle.getBundle("Messages");
		String str = rb.getString("wel.msg");//�߱���ռλ��������
		System.out.println(MessageFormat.format(str, "�Ǻ�",new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		System.out.println(Locale.getDefault());
	}

}
