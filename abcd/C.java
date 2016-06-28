package abcd;

class Message{
	private String a="hello";
	public Message(String a){
		this.a=a;
	}
	public void setInfo(String a){
		this.a=a;
	}
	public String getInfo(){
		return this.a;
	}
}



public class C {
	public static void main(String args[]){
		Message msg=new Message("hello");
		fun(msg);
		System.out.println(msg.getInfo());
	}
	public static void fun(Message temp){
		temp.setInfo("world");
	}

}


