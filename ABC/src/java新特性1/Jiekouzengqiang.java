package java������1;
interface A{
	public void print();
	default void fun(){//�ڽӿڶ���һ����ͨ����
		System.out.println("�µ�����");
	}
	static void get(){
		System.out.println("ֱ���нӿڵ���");
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
		a.fun();//�˷����ӿ�ֱ�Ӷ����
		A.get();
	}

}