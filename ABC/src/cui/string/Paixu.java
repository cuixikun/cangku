package cui.string;

public class Paixu {
	public static void main(String[] args){
		int data[]=new int[]{9,6,1,3,2,5,8,7,4};
		print(data);
		//��������������Ĵ���
		for(int x=0;x<data.length;x++){
			//�ڲ����ÿ���������
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
	//ר�Ŷ���һ������Ĺ��ܵķ���
	public static void print(int temp[]){
		for(int x=0;x<temp.length;x++){
			System.out.print(temp[x]+"��");
		}
		System.out.println();
	}
	

}
