package 正则表达式;

public class A正则4 {
	public static void main(String args[]) throws Exception{
		String str="192.168.1.1";
		String regex="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}.\\d{1,3}";//"(\\d{1,3}\\.){3}\\d{1,3}"
		System.out.println(str.matches(regex));
	}

}
