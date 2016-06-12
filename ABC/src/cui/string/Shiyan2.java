package cui.string;

public class Shiyan2 {
	public static void main(String args[]){
			String str="hellocfghggjh";
			byte [] data=str.getBytes();//将字符串变成字节数组
			for(int x=0;x<data.length;x++){
				data[x]-=32;//将小写字母转成大写字母
			}
	System.out.println(new String(data));//全部转换
	System.out.println(new String(data,5,5));//部分转换
	}

}
