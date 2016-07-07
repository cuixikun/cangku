package cui.string;

interface Subject{//����������������
	public void makeBaby();//���������ĵĺ��Ĺ���
}
class RealSubject implements Subject{
	public void makeBaby(){
		System.out.println("�ʵ�����xx");
	}
}
class ProxySubject implements Subject{
	private Subject subject;
	//Ҫ����һ����ʵ����Ĳ�������
	public ProxySubject(Subject subject){
		this.subject=subject;
	}
	public void prepare(){
		System.out.println("Ϊxx׼��");
	}
	public void makeBaby(){
		this.prepare();
		this.subject.makeBaby();//���߻ʵۿ�ʼxx
		this.destory();
	}
	public void destory(){
		System.out.println("����");
	}
}
public class Jiekoudailimoshi {
	public static void main(String args[]){
		Subject sub=new ProxySubject(new RealSubject());
		sub.makeBaby();//���ô����������
	}

}
