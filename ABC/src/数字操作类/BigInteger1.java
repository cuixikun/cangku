package ���ֲ�����;

import java.math.BigInteger;

public class BigInteger1 {
	public static void main(String args[]) throws Exception{
		BigInteger bigA=new BigInteger("22222222222222638789");
		BigInteger bigB=new BigInteger("2222222638789");
		System.out.println(bigA.add(bigB));//��
		System.out.println(bigA.subtract(bigB));//��;
		System.out.println(bigA.multiply(bigB));//��
		System.out.println(bigA.divide(bigB));//��
		BigInteger result [] = bigA.divideAndRemainder(bigB);//�̺�����
		System.out.println("�̣�"+result[0]+"��������"+result[1]);
	}

}
