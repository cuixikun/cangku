package ����;
//���಻���÷��ͣ���Ϊ���ӿ���ȷ�Ķ���һ����������
interface IMessage<T>{
	public void print(T t);
}
class MessageImpl implements IMessage<String>{
	public void print(String t){
		System.out.println(t);
	}
}

public class Fanxingjiekou2 {
	public static void main(String args[]){
		IMessage<String> msg = new MessageImpl();
		msg.print("hello world");
	}

}
