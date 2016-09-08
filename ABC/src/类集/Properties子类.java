package 类集;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties子类 {
	public static void main(String args[]) throws Exception{
		Properties pro = new Properties(); 
		pro.setProperty("bj", "北京");
		pro.setProperty("tj", "天津");
		System.out.println(pro.getProperty("bj"));
		System.out.println(pro.getProperty("gz"));
		System.out.println(pro.getProperty("gz","没有结果"));
		//保存
		pro.store(new FileOutputStream(new File("E:"+File.separator+"area.properties")),"Area Info");
	}

}
