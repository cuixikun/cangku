package cui.string;

public class Gjianzi5 {
	public static void main(String args[]){
	Book ba=new Book();
	System.out.println("ba:"+ba);
	ba.print();
	System.out.println("*********************");
	Book bb=new Book();
	System.out.println("bb:"+bb);
	bb.print();
	}

}
class Book{
	public void print(){
		//this���ǵ�ǰ���÷����Ķ���
		System.out.println("this:"+this);
	}
}