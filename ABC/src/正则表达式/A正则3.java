package ������ʽ;

public class A����3 {
	public static void main(String args[]) throws Exception{
		String str="10.1";
		String regex="\\d+(\\.\\d+)?";
		System.out.println(str.matches(regex));
		if(str.matches(regex)){
			System.out.println(Double.parseDouble(str));
		}
	}

}
