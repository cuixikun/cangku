package �༯;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set�ӿ� {
	public static void main(String args[]) throws Exception{
		Set<String> all = new HashSet<String>();//TreeSet����
		all.add("NIHAO");
		all.add("hello");
		all.add("hello");//�ظ�����
		all.add("world");
		System.out.println(all);
	}

}
