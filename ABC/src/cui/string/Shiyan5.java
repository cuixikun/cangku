package cui.string;

public class Shiyan5 {
	public static void main(String args[]){
		String str="helloworld";
		//返回满足条件单词的第一个字母索引
		System.out.println(str.indexOf("world"));
		System.out.println(str.indexOf("l"));//返回的是第一个查找到的
		System.out.println(str.indexOf("l",5));//从第五个开始
		System.out.println(str.lastIndexOf("l"));//从最后开始
	
	}

}
