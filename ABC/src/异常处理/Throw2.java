package �쳣����;
class A{//��ʾ�˷�������쳣���������ô�����
	public static int div(int x,int y)throws Exception{
		return x/y;
	}
}
public class Throw2 {
	public static void main(String args[])throws Exception{
		//��ʾ���쳣������ֱ��ͨ���������׳�
		System.out.println(A.div(10, 0));
	}//�����������׳��쳣��ֱ�ӽ���JVM��������쳣��Ϣ�������������

}
