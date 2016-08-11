package 数字操作类;

import java.util.Random;

public class Random类2 {
	public static void main(String args[]) throws Exception{
		Random rand=new Random();
		int data[]=new int[7];
		int foot=0;//数组操作脚标
		while(foot<7){
			int t=rand.nextInt(37);//生成一个不大于37的随机数
			if(!isRepeat(data,t)){
				data[foot++]=t;//保存数据
			}
		}
		java.util.Arrays.sort(data);//排序
		for(int x=0;x<data.length;x++){
			System.out.print(data[x]+"、");
		}
	}
	//该方法主要判断是否存在重复的内容，如果存在，返回true，否则false,不允许保存0，temp指已经保存的数据，num指新生产的数据，
	public static boolean isRepeat(int temp[],int num){
		if(num==0){
			return true;
		}
		for(int x=0;x<temp.length;x++){
			if(temp[x]==num){
				return true;//表示后面数据不再进行判断了
			}
		}
		return false;
	}

}
