package cui.string;

public class Paixu {
	public static void main(String[] args){
		int data[]=new int[]{9,6,1,3,2,5,8,7,4};
		print(data);
		//外层控制总体排序的次数
		for(int x=0;x<data.length;x++){
			//内层控制每次排序控制
			for(int y=0;y<data.length-1;y++){
				if(data[y]>data[y+1]){
					int t=data[y];
					data[y]=data[y+1];
					data[y+1]=t;
				}
			}
		}
		print(data);
	}
	//专门定义一个输出的功能的方法
	public static void print(int temp[]){
		for(int x=0;x<temp.length;x++){
			System.out.print(temp[x]+"、");
		}
		System.out.println();
	}
	

}
