package 正则表达式;

public class A引出 {
	public static void main(String args[]) throws Exception{
		String str="12s345";
		System.out.println(isNumber(str));
	}
	public static boolean isNumber(String temp){
		char data[]=temp.toCharArray();//将字符串变为字符数组，目的是循环取出
		for(int x=0;x<data.length;x++){
			if(data[x]>'9'||data[x]<'0'){
				return false;
			}
		}
		return true;
	}

}
