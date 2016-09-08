package 类集;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections工具类 {
	public static void main(String args[]) throws Exception{
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "a","b","c");
		Collections.reverse(all);
		System.out.println(all);
	}

}
