package ������ʽ;

public class A����4 {
	public static void main(String args[]) throws Exception{
		String str="192.168.1.1";
		String regex="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}.\\d{1,3}";//"(\\d{1,3}\\.){3}\\d{1,3}"
		System.out.println(str.matches(regex));
	}

}
