package 类集;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set接口 {
	public static void main(String args[]) throws Exception{
		Set<String> all = new HashSet<String>();//TreeSet排序
		all.add("NIHAO");
		all.add("hello");
		all.add("hello");//重复数据
		all.add("world");
		System.out.println(all);
	}

}
