package cui.string;

public class Equals {
	public static void main(String args[]){
		String stra="hello";
		String strb=new String("hello");
		String strc=strb;//���ô���
		System.out.println(stra==strb);
		//==�ǹ�ϵ���������Ҫ�����ǽ�����ֵ��ȵ��жϣ��������String��ʾ�ڴ��ַ��ֵ�ıȽ�
		System.out.println(strb.equals(stra ));
		//equalsר�Ÿ����ַ������ݵıȽ�
		System.out.println(strc.equals(strb));
		
	}

}
