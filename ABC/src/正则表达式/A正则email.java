package 正则表达式;

public class A正则email {
	public static void main(String args[]) throws Exception{
		String str="hello_nihao123@mldn.cn";
		String regex="\\w+@\\w+\\.\\w+";
		System.out.println(str.matches(regex));
	}


}
