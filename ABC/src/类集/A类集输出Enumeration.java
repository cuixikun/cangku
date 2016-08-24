package 类集;

import java.util.Enumeration;
import java.util.Vector;

public class A类集输出Enumeration {
	public static void main(String args[]) throws Exception{
		Vector<String> all = new Vector<String>();
		all.add("AA");
		all.add("aaaaaaaa");
		all.add("bbbbbbbbb");
		all.add("bbbbbbbbb");
		all.add("cccccccccc");
		all.add("bbbbbbbbb");
		Enumeration<String> enu = all.elements();
		while(enu.hasMoreElements()){
			String str = enu.nextElement();
			System.out.println(str);
		}
	}

}
