package cui.string;

abstract class J{
	public abstract void print();
	private static class K extends J{
		public void print(){
			System.out.println("hello world");
			
		}
	}
	//�����������ʵ�����������
	public static J getInstance(){
		return new K();
	}
}

public class Chouxianglei3 {
	public static void main(String args[]){
		//��ʱȡ�ó���������ʱ����ȫ����Ҫ֪������Ĵ���
		J j=J.getInstance();
		j.print();
	}

}
