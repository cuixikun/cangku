package �������;

public class System�� {
	public static void main(String args[]) throws Exception{
		long start = System.currentTimeMillis();//ȡ�ÿ�ʼʱ��
		String str="";
		for(int x=0;x<3000;x++){
			str+=x;
		}
		long end=System.currentTimeMillis();
		System.out.println("���β�������ʱ�䣺"+(end-start));
	}

}
