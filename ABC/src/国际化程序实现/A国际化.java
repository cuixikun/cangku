package 国际化程序实现;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
public class A国际化 {
	public static void main(String args[]) throws Exception{
		ResourceBundle rb = ResourceBundle.getBundle("Messages");
		String str = rb.getString("wel.msg");//具备有占位符的内容
		System.out.println(MessageFormat.format(str, "呵呵",new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		System.out.println(Locale.getDefault());
	}

}
