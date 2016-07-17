package 访问权限2;
import 访问权限.A;
public class B extends A{//是A不同包的子类
	public void print(){
		System.out.println("A类的info="+super.info);
	}

}
