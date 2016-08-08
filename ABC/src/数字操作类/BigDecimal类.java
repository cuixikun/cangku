package 数字操作类;

import java.math.BigDecimal;

class MyMath{
	/**
	 * @param number要进行四舍五入的数字
	 * @param scale要保留的小数位
	 * @return处理后的四舍五入数据
	 */
	public static double round(double num,int scale){
		BigDecimal bigA=new BigDecimal(num);
		BigDecimal bigB=new BigDecimal(1);
		return bigA.divide(bigB,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
public class BigDecimal类 {
	public static void main(String args[]) throws Exception{
		System.out.println(MyMath.round(19.78915247999666, 2));
		System.out.println(MyMath.round(-15.5, 0));
	}

}
