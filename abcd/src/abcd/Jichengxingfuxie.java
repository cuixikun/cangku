package abcd;

class E{
	public void fun(){
		System.out.println("E���е�fun()����");
	}
}
class F{
	public void fun(){//�˴�Ϊ��д
		System.out.println("F���е�fun()����");
	}
}
public class Jichengxingfuxie {
	public void main(String args[]){
		F f=new F();
		f.fun();
	}

}
