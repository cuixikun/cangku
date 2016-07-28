package java新特性1;
import java.util.function.Consumer;
class MyDemo{
	public void print(String str){//没有返回值，有参数
		System.out.println(str);
	}
}
public class Xiaofeixingjiekou {
	public static void main(String args[]){
		Consumer<String> cons=new MyDemo()::print;
		cons.accept("hello world");
	}

}
