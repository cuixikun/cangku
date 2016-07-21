package object;

public class Foreach {
	public static void main(String args[]){
		int data[]=new int[]{1,2,3,4,5};
		for(int x:data){//循环次数由数组长度决定
			System.out.println(x);
		}
	}

}
