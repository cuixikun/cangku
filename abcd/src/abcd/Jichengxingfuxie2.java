package abcd;

class G{
	String info="hello";
}
class H extends G{
	int info=100;
	public void print(){
		System.out.println(this.info);//先看子类，再看父类
		System.out.println(super.info);//直接看父类
	}
	
}
public class Jichengxingfuxie2 {
	public static void main(String args[]){
		H h=new H();
		h.print();
	}

}
