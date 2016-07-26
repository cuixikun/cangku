package java新特性1;
interface A{
	public void print();
	default void fun(){//在接口定义一个普通方法
		System.out.println("新的特性");
	}
	static void get(){
		System.out.println("直接有接口调用");
	}
}
class B implements A{
	public void print(){
		System.out.println("hello world");
	}
}
public class Jiekouzengqiang {
	public static void main(String args[]){
		A a=new B();
		a.fun();//此方法接口直接定义的
		A.get();
	}

}