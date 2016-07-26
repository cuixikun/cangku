package java新特性1;
/**
 * 实现方法的引用接口
 * @param <P>引用方法的参数类型
 * @param <R>引用方法的返回类型
 */
//类名称::static方法名称
interface E<P,R>{
	public R zhuanhuan(P p);
}
public class Fangfayinyong {
	public static void main(String args[]){
		//将String。valueOf方法变为了E接口里的zhuanhuan()方法
		E<Integer,String> e=String::valueOf;
		String str=e.zhuanhuan(1000);
		System.out.println(str.replaceAll("0","9"));
	}

}
