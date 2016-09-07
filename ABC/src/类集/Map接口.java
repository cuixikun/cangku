package 类集;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map接口 {
	public static void main(String args[]) throws Exception{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("一", 1);
		map.put("二", 2);
		map.put("三", 3);
		map.put("三", 333);//key重复
		map.put(null, 0);
		System.out.println(map);
		System.out.println(map.get("一"));
		System.out.println(map.get("六"));
		System.out.println(map.get(null));
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
