package 国际化程序实现;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class B国际化 {
	public static void main(String args[]) throws Exception{
		Locale loc = new Locale("en","US");
		ResourceBundle rb = ResourceBundle.getBundle("Messages",loc);
		String str = rb.getString("wel.msg");//具备有占位符的内容
		System.out.println(MessageFormat.format(str,"阿尤" ));
		
	}

}
