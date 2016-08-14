package 正则表达式;

public class A正则6 {
	public static void main(String args[]) throws Exception{
		String str="12345678";
		String str2="010-12345678";
		String str3="(010)-12345678";
		String regex="(\\(?\\d{3,4}\\)?-)?\\d{7,8}";
		System.out.println(str.matches(regex));
		System.out.println(str2.matches(regex));
		System.out.println(str3.matches(regex));
	}

}
