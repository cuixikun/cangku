package cui.string;

public class Paixu2 {
	public static void main(String[] args){
		int data[]=new int[]{9,6,1,3,2,5,8,7,4};
		sort(data);//实现排序
		print(data);
	}
	//这个方法专门负责排序
	public static void sort(int abc[]){
		for(int x=0;x<abc.length;x++){
			for(int y=0;y<abc.length-1;y++){
				if(abc[y]>abc[y+1]){
					int t=abc[y];
					abc[y]=abc[y+1];
					abc[y+1]=t;
				}
			}
		}
	}
	public static void print(int temp[]){
		for(int x=0;x<temp.length;x++){
			System.out.print(temp[x]+"、");
		}
		System.out.println();
	}


}
