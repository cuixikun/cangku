package cui.string;

public class Shiyan {
	public static void main(String args[]){
		String str="127436487395";
		if(isNumber(str)){
			System.out.println("�ַ�����������ɣ�");
		}else {
			System.out.println("�ַ����������������");
		}
	}
//�ж��ַ����Ƿ���������ɣ�����Ƿ���true�����򷵻�false
	public static boolean isNumber(String temp){
		//���ַ�������ַ����飬�����Ϳ���ȡ��ÿһλ�ַ������ж�
		char [] data=temp.toCharArray();
		for(int x=0;x<data.length;x++){
			if(data[x]>'9'||data[x]<0){
				return false;
			}
		}
		return true;
	}
}
