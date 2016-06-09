package cui.string;

public class Shuzudaozhi {
	public static void main(String[] args){
		int data[]=new int[]{9,6,1,3,2,5,8,7,4};
		reverse(data);//实现转置
		print(data);
	}
   //此方法专门实现数组转置
    public static void reverse(int aaa[]){
    	int len=aaa.length/2;//转置的次数
    	int head=0;            //头部索引
    	int tail=aaa.length-1;//尾部索引
    	for(int x=0;x<len;x++){
    		int temp=aaa[head];
    		aaa[head]=aaa[tail];
    		aaa[tail]=temp;
    		head++;
    		tail--;
    	}
    
  }
    public static void print(int temp[]){
		for(int x=0;x<temp.length;x++){
			System.out.print(temp[x]+"、");
		}
		System.out.println();
	}


}