package 异常处理;
class A{//表示此方法里的异常交给被调用处处理
	public static int div(int x,int y)throws Exception{
		return x/y;
	}
}
public class Throw2 {
	public static void main(String args[])throws Exception{
		//表示次异常产生后直接通过主方法抛出
		System.out.println(A.div(10, 0));
	}//主方法出现抛出异常，直接交给JVM处理，输出异常信息，结束程序调用

}
