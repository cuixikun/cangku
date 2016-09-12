package 类集;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream匹配 {
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
		Predicate<String> p1 = (x)-> x.contains("good");
		Predicate<String> p2 = (x)-> x.contains("geed");
		Stream<String> stream = all.stream();
		if(stream.anyMatch(p1.or(p2))){
			System.out.println("数据存在");
		}
	}

}
