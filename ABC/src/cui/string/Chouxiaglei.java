package cui.string;

abstract class Q{//����һ��������
	public Q(){
		System.out.println("*******************");
	}
	public void fun(){//��ͨ����
		System.out.println("�����з�����ķ���");
	}
	public abstract void print();
}
//һ������ֻ�ܼ̳�һ��������
class P extends Q {
	public P(){
		System.out.println("########################");
	}
	public void print(){//ǿ��Ҫ��д�ķ���
		System.out.println("hello world");
	}
	
}

public class Chouxiaglei {
	public static void main(String args[]){
		Q q=new P();//����ת��
		q.print();//�����าд���÷���
	}

}
