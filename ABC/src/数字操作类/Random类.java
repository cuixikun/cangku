package ���ֲ�����;

import java.util.Random;

public class Random�� {
	public static void main(String args[]) throws Exception{
		Random rand=new Random();
		for(int x=0;x<10;x++){
			System.out.print(rand.nextInt(100)+"��");
		}
	}

}
