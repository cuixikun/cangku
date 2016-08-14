package 正则表达式;

public class A正则email2 {
	public static void main(String args[]) throws Exception{
		String str="hello.nihao123_123@com.cn";
		String regex="[a-zA-Z][a-zA-Z0-9_\\.]{0,28}[a-zA-Z0-9]@\\w+\\.(net|cn|com\\.cn|net\\.cn|org|gov|edu)";
		System.out.println(str.matches(regex));
	}

}
