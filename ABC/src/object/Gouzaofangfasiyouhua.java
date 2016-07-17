

//构造方法私有化，在类的内部定义static属性与方法，利用static方法取得本类的实例化对象
//不管外部产生多少个Singleton对象，但是本质永远只有唯一的一个实例化对象
//
package object;
class Singleton{
	private static final Singleton INSTANCE =new Singleton();
	private Singleton(){}//构造方法私有化
	public static Singleton getInstance(){
		return INSTANCE;
	}
	public void print(){
		System.out.println("hello world");
	}
}

public class Gouzaofangfasiyouhua {
	public static void main(String args[]){
		Singleton s=Singleton.getInstance();
		s.print();
	}

}
