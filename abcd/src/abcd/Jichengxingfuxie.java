package abcd;

class E{
	public void fun(){
		System.out.println("E类中的fun()方法");
	}
}
class F{
	public void fun(){//此处为覆写
		System.out.println("F类中的fun()方法");
	}
}
public class Jichengxingfuxie {
	public void main(String args[]){
		F f=new F();
		f.fun();
	}

}
