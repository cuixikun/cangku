package java新特性1;
interface C{
	public void print();
}
public class Lamda {
	public static void main(String args[]){
		fun(()->System.out.println("hello world"));
	}//     ()->单行语句
	//      ()->{单行语句}
	//      ()->表达式
	public static void fun(C c){
		c.print();
	}

}
