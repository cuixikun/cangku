package cui.string;

class Message{
	private int num=10;
	public Message(int num){
		this.num=num;
	}
	public void setNum(int num){
		this.num=num;
	}
	public int getNum(){
		return this.num;
	}
}

public class Dianyongfanli {
	public static void main(String args[]){
		Message msg=new Message(30);
		fun(msg);//���ô���
		System.out.println(msg.getNum());
	}
	public static void fun(Message temp){
		temp.setNum(100);
	}

}
