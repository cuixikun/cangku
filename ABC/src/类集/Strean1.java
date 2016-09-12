package 类集;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strean1 {
	public static void main(String args[]) throws Exception{
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hAllo");
		all.add("world");
		all.add("world");
		all.add("good");
		all.add("geed");
		all.add("gcvdd");
		all.add("gsvad");
		all.add("gbcacmd");
		Stream<String> stream = all.stream();//取得了stream类对象
		//System.out.println(stream.count());//取得数据个数
		//System.out.println(stream.distinct().count());//取得消除重复数据个数
		//去掉重复数据形成新的集合数据，里面是不包含重复数据的集合
		//List<String> newAll = stream.distinct().collect(Collectors.toList());
		//newAll.forEach(System.out::println);
		//过滤操作，使用了断言性函数式接口，使用了string类中的contains()方法，                                                 // 跳两个， 取两个
		List<String> newAll = stream.distinct()
				.map((x)->x.toLowerCase())
				.skip(2).limit(2)
				.filter((x) ->x.contains("a"))
				.collect(Collectors.toList());
		newAll.forEach(System.out::println);//结果区分大小写
	}

}
