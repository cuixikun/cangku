package cui.string;

abstract class Q{//定义一个抽象类
	public Q(){
		System.out.println("*******************");
	}
	public void fun(){//普通方法
		System.out.println("存在有方法体的方法");
	}
	public abstract void print();
}
//一个子类只能继承一个抽象类
class P extends Q {
	public P(){
		System.out.println("########################");
	}
	public void print(){//强制要求覆写的方法
		System.out.println("hello world");
	}
	
}

public class Chouxiaglei {
	public static void main(String args[]){
		Q q=new P();//向上转型
		q.print();//被子类覆写过得方法
	}

}
