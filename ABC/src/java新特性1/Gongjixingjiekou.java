package java������1;

import java.util.function.Supplier;
//û�в������з���ֵ
public class Gongjixingjiekou {
	public static void main(String args[]){
		Supplier<String> sup="hello"::toUpperCase;
		System.out.println(sup.get());
	}

}
