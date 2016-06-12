package cui.string;

public class Shiyan {
	public static void main(String args[]){
		String str="127436487395";
		if(isNumber(str)){
			System.out.println("字符串由数字组成！");
		}else {
			System.out.println("字符串不是由数字组成");
		}
	}
//判断字符串是否有数字组成，如果是返回true，否则返回false
	public static boolean isNumber(String temp){
		//将字符串变成字符数组，这样就可以取出每一位字符进行判断
		char [] data=temp.toCharArray();
		for(int x=0;x<data.length;x++){
			if(data[x]>'9'||data[x]<0){
				return false;
			}
		}
		return true;
	}
}
