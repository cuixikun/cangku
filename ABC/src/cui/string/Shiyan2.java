package cui.string;

public class Shiyan2 {
	public static void main(String args[]){
			String str="hellocfghggjh";
			byte [] data=str.getBytes();//���ַ�������ֽ�����
			for(int x=0;x<data.length;x++){
				data[x]-=32;//��Сд��ĸת�ɴ�д��ĸ
			}
	System.out.println(new String(data));//ȫ��ת��
	System.out.println(new String(data,5,5));//����ת��
	}

}
