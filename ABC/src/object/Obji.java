package object;

interface A{
	public void fun();
}
class B implements A{
	public void fun(){
		System.out.println("hello");
	}
}
public class Obji {
	public static void main(String args[]){
		A a=new B();
		A obj=a;
		A t=(A)obj;
		t.fun();
	}

}
