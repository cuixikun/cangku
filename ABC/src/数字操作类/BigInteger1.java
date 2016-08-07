package 数字操作类;

import java.math.BigInteger;

public class BigInteger1 {
	public static void main(String args[]) throws Exception{
		BigInteger bigA=new BigInteger("22222222222222638789");
		BigInteger bigB=new BigInteger("2222222638789");
		System.out.println(bigA.add(bigB));//加
		System.out.println(bigA.subtract(bigB));//减;
		System.out.println(bigA.multiply(bigB));//乘
		System.out.println(bigA.divide(bigB));//除
		BigInteger result [] = bigA.divideAndRemainder(bigB);//商和余数
		System.out.println("商："+result[0]+"，余数："+result[1]);
	}

}
