package cui.string;

class Outer{//外部类
	private String demo="hello world";//private static String demo
	class Inner{//定义一个内部类                                      //static class Inner
		public void print(){
			//外部类。this=外部类的当前对象
			System.out.println(Outer.this.demo);
		}
		
	}
}

public class Waibulei {
	public static void main(String args[]){
		Outer.Inner in=new Outer().new Inner();//new Outer.Inner()
		in.print();
	}

}
