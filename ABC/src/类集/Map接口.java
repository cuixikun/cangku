package �༯;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map�ӿ� {
	public static void main(String args[]) throws Exception{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("һ", 1);
		map.put("��", 2);
		map.put("��", 3);
		map.put("��", 333);//key�ظ�
		map.put(null, 0);
		System.out.println(map);
		System.out.println(map.get("һ"));
		System.out.println(map.get("��"));
		System.out.println(map.get(null));
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
