package object;

public class Kebiancanshu {
	public static void main(String args[]){
		System.out.println(add(new int[]{1,2,3}));
		System.out.println(add(new int[]{10,20}));
		System.out.println(add(1,2,3));
	}
	/**
	 * 实现任意多个整形数据的操作
	 * @param data因为要接受多个整形数据，所以要用数组完成接收
	 * @return多个整形数据的累加结果
	 */
	public static int add(int ... data){
		int sum=0;
		for(int x=0;x<data.length;x++){
			sum+=data[x];
		}
		return sum;
	}
}
