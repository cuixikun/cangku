package �༯;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A������� {
	public static void main(String args[]) throws Exception{
		Set<String> all= new HashSet<String>();
		all.add("AA");
		all.add("aaaaaaaa");
		all.add("bbbbbbbbb");
		all.add("bbbbbbbbb");
		all.add("cccccccccc");
		all.add("bbbbbbbbb");
		Iterator<String> iter = all.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.println(str);
		}
	}

}
