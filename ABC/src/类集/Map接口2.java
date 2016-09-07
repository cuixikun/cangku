package 类集;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map接口2 {
	public static void main(String args[]) throws Exception{
		Map<String,Integer> map = new Hashtable<String,Integer>();
		map.put("一", 1);
		map.put("二", 2);
		map.put("三", 3);
		map.put("三", 333);//key重复
		//将Map集合变为set集合，目的是为了使用Iterator()方法
		Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry<String,Integer> me = iter.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
