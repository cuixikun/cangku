package javaĞÂÌØĞÔ1;
import java.util.function.Function;
public class Hanshushijiekou {
	public static void main(String args[]){
		Function<String,Boolean> fun="##hello"::startsWith;
		System.out.println(fun.apply("##"));
	}

}
