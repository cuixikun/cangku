package ������ʽ;

public class A���� {
	public static void main(String args[]) throws Exception{
		String str="12s345";
		System.out.println(isNumber(str));
	}
	public static boolean isNumber(String temp){
		char data[]=temp.toCharArray();//���ַ�����Ϊ�ַ����飬Ŀ����ѭ��ȡ��
		for(int x=0;x<data.length;x++){
			if(data[x]>'9'||data[x]<'0'){
				return false;
			}
		}
		return true;
	}

}
