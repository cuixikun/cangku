package cui.string;//�����಻������final

abstract class G{
	//��������ڲ������ʹ��static
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
