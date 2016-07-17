

//���췽��˽�л���������ڲ�����static�����뷽��������static����ȡ�ñ����ʵ��������
//�����ⲿ�������ٸ�Singleton���󣬵��Ǳ�����Զֻ��Ψһ��һ��ʵ��������
//
package object;
class Singleton{
	private static final Singleton INSTANCE =new Singleton();
	private Singleton(){}//���췽��˽�л�
	public static Singleton getInstance(){
		return INSTANCE;
	}
	public void print(){
		System.out.println("hello world");
	}
}

public class Gouzaofangfasiyouhua {
	public static void main(String args[]){
		Singleton s=Singleton.getInstance();
		s.print();
	}

}
