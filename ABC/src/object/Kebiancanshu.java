package object;

public class Kebiancanshu {
	public static void main(String args[]){
		System.out.println(add(new int[]{1,2,3}));
		System.out.println(add(new int[]{10,20}));
		System.out.println(add(1,2,3));
	}
	/**
	 * ʵ���������������ݵĲ���
	 * @param data��ΪҪ���ܶ���������ݣ�����Ҫ��������ɽ���
	 * @return����������ݵ��ۼӽ��
	 */
	public static int add(int ... data){
		int sum=0;
		for(int x=0;x<data.length;x++){
			sum+=data[x];
		}
		return sum;
	}
}
