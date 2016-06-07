package cui.string;

public class Shuzu3 {
	public static void main(String[] args){
		int data[]=new int[]{1,2,3};
		int temp[]=data;
		for(int x=0;x<temp.length;x++){
			temp[x]*=2;
		}
		
		for(int x=0;x<data.length;x++){
			System.out.println(data[x]);
		}
	
}
//此方法定义在主类中，并且由主方法直接调用
public static void change(int temp[]){
	
  }
}



