package cui.string;

public class Shiyan5 {
	public static void main(String args[]){
		String str="helloworld";
		//���������������ʵĵ�һ����ĸ����
		System.out.println(str.indexOf("world"));
		System.out.println(str.indexOf("l"));//���ص��ǵ�һ�����ҵ���
		System.out.println(str.indexOf("l",5));//�ӵ������ʼ
		System.out.println(str.lastIndexOf("l"));//�����ʼ
	
	}

}
