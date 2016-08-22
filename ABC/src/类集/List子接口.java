package 类集;

import java.util.ArrayList;
import java.util.List;

public class List子接口 {
	public static void main(String args[]) throws Exception{
		//设置了泛型，保证了集合中所有的数据类型都一致
		List<String> all = new ArrayList<String>();
		System.out.println("长度："+all.size()+"，是否为空："+all.isEmpty());
		all.add("hello");
		all.add("hello");//可以保存重复
		all.add("world");
		System.out.println("长度："+all.size()+"，是否为空："+all.isEmpty());
		for(int x=0;x<all.size();x++){
			String str = all.get(x);
			System.out.println(str);
		}
	}

}
