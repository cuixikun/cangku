package ���ֲ�����;

import java.math.BigDecimal;

class MyMath{
	/**
	 * @param numberҪ�����������������
	 * @param scaleҪ������С��λ
	 * @return������������������
	 */
	public static double round(double num,int scale){
		BigDecimal bigA=new BigDecimal(num);
		BigDecimal bigB=new BigDecimal(1);
		return bigA.divide(bigB,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
public class BigDecimal�� {
	public static void main(String args[]) throws Exception{
		System.out.println(MyMath.round(19.78915247999666, 2));
		System.out.println(MyMath.round(-15.5, 0));
	}

}
