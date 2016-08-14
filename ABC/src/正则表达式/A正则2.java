package 正则表达式;

public class A正则2 {
	public static void main(String args[]) throws Exception{
		String str="wgjhackjdp92fdk3245jjf4k2k1";
		String regex="\\d+";//[0-9]
		String result[]=str.split(regex);
		for(int x=0;x<result.length;x++){
			System.out.println(result[x]);
		}
	}

}
