package ���ֲ�����;

import java.util.Random;

public class Random��2 {
	public static void main(String args[]) throws Exception{
		Random rand=new Random();
		int data[]=new int[7];
		int foot=0;//��������ű�
		while(foot<7){
			int t=rand.nextInt(37);//����һ��������37�������
			if(!isRepeat(data,t)){
				data[foot++]=t;//��������
			}
		}
		java.util.Arrays.sort(data);//����
		for(int x=0;x<data.length;x++){
			System.out.print(data[x]+"��");
		}
	}
	//�÷�����Ҫ�ж��Ƿ�����ظ������ݣ�������ڣ�����true������false,��������0��tempָ�Ѿ���������ݣ�numָ�����������ݣ�
	public static boolean isRepeat(int temp[],int num){
		if(num==0){
			return true;
		}
		for(int x=0;x<temp.length;x++){
			if(temp[x]==num){
				return true;//��ʾ�������ݲ��ٽ����ж���
			}
		}
		return false;
	}

}
