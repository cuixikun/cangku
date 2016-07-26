package java新特性1;
interface C{
	public void print(String str);
}
public class Lamda2 {
	public static void main(String args[]){
		//首先要定义此表达式需要接受变量，单行语句直接进行输出
		fun((s)->{
			s=s.toUpperCase();//转大写
			System.out.println(s);
			});
	}
	public static void fun(C c){
		c.print("hello world");//设置参数的内容
	}

}
