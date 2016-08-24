package 类集;

import java.util.ArrayList;
import java.util.List;

public class A集合输出foreach {
	public static void main(String args[]) throws Exception{
		List<String> all = new ArrayList<String>();
		all.add("AA");
		all.add("aaaaaaaa");
		all.add("bbbbbbbbb");
		all.add("bbbbbbbbb");
		all.add("cccccccccc");
		all.add("bbbbbbbbb");
		for(String str:all){
			System.out.println(str);
		}
	}

}
