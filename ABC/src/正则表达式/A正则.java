package 正则表达式;

public class A正则 {
	public static void main(String args[]) throws Exception{
		String str="wgjhackjdp92-02['';d'3=20--";
		String regex="[^a-z]";//此处编写正则
		System.out.println(str.replaceAll( regex,""));
	}

}