package lianshou;


interface Ali{
	public void print(String str);
}
public class AAA {
	public static void main(String args[]){
		//����Ҫ����˱��ʽ��Ҫ���ܱ������������ֱ�ӽ������
		fun((s)->{
			s=s.toUpperCase();//ת��д
			System.out.println(s);
			});
	}
	public static void fun(Ali c){
		c.print("hello world");//���ò���������
	}

}
