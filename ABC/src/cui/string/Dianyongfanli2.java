package cui.string;

public class Dianyongfanli2 {
	public static void main(String args[]){
		String msg="hello";
		fun(msg);
		System.out.println(msg);
	}
	//string类对象的内容一旦声明则不可改变，对象内容的改变是依靠引用地址的改变
	public static void fun(String temp){
		temp="world";
	}


}
