package cui.string;//抽象类不可以用final

abstract class G{
	//抽象类的内部类可以使用static
	static abstract class H{
		public abstract void print();
	}
}
class I extends G.H{
	public void print(){
		System.out.println("@@@@@@@@@@@@@@@@@");
	}
}
public class Chouxianglei2 {
	public static void main(String args[]){
		G.H gh=new I();
		gh.print();
	}

}
