package java������1;
interface C{
	public void print(String str);
}
public class Lamda2 {
	public static void main(String args[]){
		//����Ҫ����˱��ʽ��Ҫ���ܱ������������ֱ�ӽ������
		fun((s)->{
			s=s.toUpperCase();//ת��д
			System.out.println(s);
			});
	}
	public static void fun(C c){
		c.print("hello world");//���ò���������
	}

}
