package cui.string;

interface M{//����һ���ӿ�
	public static final String MSG="hello";//ȫ�ֳ��� final String MSG="hello";
	public abstract void print();//���󷽷�  void print();
}
interface N{
	public abstract void get();
}
abstract class O{
	public abstract void change();
}
class Z extends O implements M,N{//z��ʵ��M,N�����ӿ�
	public void print(){
		System.out.println("M�ӿڵĳ��󷽷�");
	}
	public void get(){
		System.out.println("N�ӿڵĳ��󷽷�");
	}
	public void change(){
		System.out.println("O��ĳ��󷽷�");
	}
}
public class Jiekou {
	public static void main (String args[]){
		Z z=new Z();//ʵ�����������
		M m=z;//����ת��
		N n=z;//����ת��
		m.print();
		n.get();
	}

}
