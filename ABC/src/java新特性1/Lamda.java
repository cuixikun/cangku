package java������1;
interface C{
	public void print();
}
public class Lamda {
	public static void main(String args[]){
		fun(()->System.out.println("hello world"));
	}//     ()->�������
	//      ()->{�������}
	//      ()->���ʽ
	public static void fun(C c){
		c.print();
	}

}
