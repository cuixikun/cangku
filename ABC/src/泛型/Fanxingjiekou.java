package ·ºÐÍ;
interface IMessage<T>{
	public void print(T t);
}
class MessageImpl<T> implements IMessage<T>{
	public void print(T t){
		System.out.println(t);
	}
}
public class Fanxingjiekou {
	public static void main(String args[]){
		IMessage<String> msg = new MessageImpl<String>();
		msg.print("hello world");
	}

}
