package cui.string;

class Array{
	private int data[];//����һ������
	private int foot;//����Ĳ����ű�
	public Array(int len){//���챾�����ʱ��Ҫ���ô�С
		if(len>0){
			this.data=new int[len];//����һ������
		}else{
			this.data=new int[1];//ά��һ��Ԫ��
		}
	}
	public boolean add(int num){
		if(this.foot<this.data.length){
			this.data[this.foot++]=num;
			return true;
		}
		return false;
	}
	public int [] getData(){
		return this.data;
	}
}
class SortArray extends Array{
	public SortArray(int len){
		super(len);
	}
	public int [] getData(){
		java.util.Arrays.sort(super.getData());//����
		return super.getData();
	}
}
class ReverseArray extends Array{
	public ReverseArray(int len){
		super(len);
	}
	public int [] getData(){
		int center=super.getData().length/2;
		int head=0;
		int tail=super.getData().length-1;
		for(int x=0;x<center;x++){
			int temp=super.getData()[head];
			super.getData()[head]=super.getData()[tail];
			super.getData()[tail]=temp;
			head++;
			tail--;
		}
		return super.getData();
	}
}

public class Shuzucaozuo {
	public static void main(String args[]){
		ReverseArray arr=new ReverseArray(3);
		System.out.println(arr.add(10));
		System.out.println(arr.add(8));
		System.out.println(arr.add(20));
		System.out.println(arr.add(100));
		System.out.println(arr.add(200));
		int [] temp=arr.getData();
		for(int x=0;x<temp.length;x++){
			System.out.println(temp[x]);
		}
	}

}
