package java������1;
import java.util.function.Consumer;
class MyDemo{
	public void print(String str){//û�з���ֵ���в���
		System.out.println(str);
	}
}
public class Xiaofeixingjiekou {
	public static void main(String args[]){
		Consumer<String> cons=new MyDemo()::print;
		cons.accept("hello world");
	}

}
