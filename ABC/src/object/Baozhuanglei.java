package object;

class MyInt{//һ����
	private int num;//������װ�Ļ�����������
	//�����Ŀ����Ϊ�˽������������ʹ��ݸ�����
	public MyInt(int num){//���������Ͱ�װ
		this.num=num;
	}
	public int intValue(){//����װ���������ݷ���
		return this.num;
	}
}

public class Baozhuanglei {
	public static void main(String args[]){
		MyInt mi=new MyInt(10);//��int��װΪ��
		int temp=mi.intValue();//�������а�װ������ȡ��
		//ֻ��ȡ����װ���ݲſ��Լ���
		System.out.println(temp*2);
	}

}
