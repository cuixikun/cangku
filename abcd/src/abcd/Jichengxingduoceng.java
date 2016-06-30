package abcd;

class A{
	private String msg;
	public void setMsg(String msg){
		this.msg=msg;
	}
	public String getMsg(){
		return this.msg;
	}
	
}
class B extends A{
	
}

class C extends B {
	
}
public class Jichengxingduoceng {
	public static void main(String args[]){
		B b=new B();
		b.setMsg("hello");
		System.out.println(b.getMsg());
	}

}
