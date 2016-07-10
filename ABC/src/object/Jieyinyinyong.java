package object;

public class Jieyinyinyong {
	public static void main(String args[]){
		int[] obji=new int[] {1,2,3};//向上转型
		System.out.println(obji);
		if(obji instanceof int[]){
			int data[]=(int[])obji;//向下转型
			for(int x=0;x<data.length;x++){
				System.out.println(data[x]);
			}
		}
    }
}