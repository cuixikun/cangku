package �������;
class Member{
	public Member(){
		System.out.println("��˹��");
	}
	protected void finalize() throws Throwable{
		System.out.println("��������");
		throw new Exception("�۰�����");
	}
}
public class System��2 {
	public static void main(String args[]) throws Exception{
		Member mem = new Member();//�����һЩ��������
		mem=null;//���������
		System.gc();//�ֹ����������ռ����۰����»���ʧ
	}

}
