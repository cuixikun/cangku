package �༯;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties���� {
	public static void main(String args[]) throws Exception{
		Properties pro = new Properties(); 
		pro.setProperty("bj", "����");
		pro.setProperty("tj", "���");
		System.out.println(pro.getProperty("bj"));
		System.out.println(pro.getProperty("gz"));
		System.out.println(pro.getProperty("gz","û�н��"));
		//����
		pro.store(new FileOutputStream(new File("E:"+File.separator+"area.properties")),"Area Info");
	}

}
