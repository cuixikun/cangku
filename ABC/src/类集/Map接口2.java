package �༯;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map�ӿ�2 {
	public static void main(String args[]) throws Exception{
		Map<String,Integer> map = new Hashtable<String,Integer>();
		map.put("һ", 1);
		map.put("��", 2);
		map.put("��", 3);
		map.put("��", 333);//key�ظ�
		//��Map���ϱ�Ϊset���ϣ�Ŀ����Ϊ��ʹ��Iterator()����
		Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry<String,Integer> me = iter.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
