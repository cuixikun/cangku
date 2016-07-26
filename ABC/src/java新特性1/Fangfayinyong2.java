package java新特性1;
/**
 * 实现方法的引用接口
 * @param <P>引用方法的参数类型
 * @param <R>引用方法的返回类型
 */
//实例化对象::普通方法
interface F<R>{
	public R upper();
}
public class Fangfayinyong2 {
	public static void main(String args[]){
		//String类的toUpperCase()定义：public String toUpperCase()
		//这个方法没有参数，但是有返回值，并且这个方法一定要在有实例化对象的情况下才可以调用
		//"hello"字符串是String类的实例化对象，所以可以直接调用toUpperCase()方法
		//将toUpperCase()函数的应用交给了F接口
		F<String> f="hello"::toUpperCase;
		String str=f.upper();//相当于hello。toUpperCase()
		System.out.println(str);
	}

}
