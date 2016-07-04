package cui.string;

abstract class J{
	public abstract void print();
	private static class K extends J{
		public void print(){
			System.out.println("hello world");
			
		}
	}
	//这个方法不受实例化对象控制
	public static J getInstance(){
		return new K();
	}
}

public class Chouxianglei3 {
	public static void main(String args[]){
		//此时取得抽象类对象的时候完全不需要知道子类的存在
		J j=J.getInstance();
		j.print();
	}

}
