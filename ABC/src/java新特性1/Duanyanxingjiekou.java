package javaĞÂÌØĞÔ1;
import java.util.function.Predicate;
public class Duanyanxingjiekou {
	public static void main(String args[]){
		Predicate<String> pre="hello"::equalsIgnoreCase;
		System.out.println(pre.test("HELLO"));
	}

}
