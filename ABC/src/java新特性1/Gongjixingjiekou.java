package java新特性1;

import java.util.function.Supplier;
//没有参数，有返回值
public class Gongjixingjiekou {
	public static void main(String args[]){
		Supplier<String> sup="hello"::toUpperCase;
		System.out.println(sup.get());
	}

}
