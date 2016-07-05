package cui.string;

interface M{//定义一个接口
	public static final String MSG="hello";//全局常量 final String MSG="hello";
	public abstract void print();//抽象方法  void print();
}
interface N{
	public abstract void get();
}
abstract class O{
	public abstract void change();
}
class Z extends O implements M,N{//z类实现M,N两个接口
	public void print(){
		System.out.println("M接口的抽象方法");
	}
	public void get(){
		System.out.println("N接口的抽象方法");
	}
	public void change(){
		System.out.println("O类的抽象方法");
	}
}
public class Jiekou {
	public static void main (String args[]){
		Z z=new Z();//实例化子类对象
		M m=z;//向上转型
		N n=z;//向上转型
		m.print();
		n.get();
	}

}
