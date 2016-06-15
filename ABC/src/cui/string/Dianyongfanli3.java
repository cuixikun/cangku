package cui.string;

class Message{
	private String info="hello";
	public Message(String info){
		this.info=info;
	}
	public void setInfo(String info){
		this.info=info;
	}
	public String getInfo(){
		return this.info;
	}
}


public class Dianyongfanli3 {
	public static void main(String args[]){
		Message msg=new Message("hello");
		fun(msg);
		System.out.println(msg.getInfo());
	}
	public static void fun(Message temp){
		temp.setInfo("world");
	}

}
