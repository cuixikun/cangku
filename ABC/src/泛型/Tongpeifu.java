package ����;
class Message<T>{
	private T msg;
	public void setMsg(T msg){
		this.msg=msg;
	}
	public T getMsg(){
		return msg;
	}
}

public class Tongpeifu {
	public static void main(String args[]){
		Message<String> m=new Message<String>();
		m.setMsg("hello world");
		fun(m);
	}
	public static void fun(Message<?> temp){//��?ͨ����ĵĻ����ϻ������������ͨ���
		System.out.println(temp.getMsg());//?extends�࣬���÷������ޣ������������Ϻͷ���������ʹ��
	}                                    //?extends Number,��ζ�ſ�������number��number�����ࣨInteger, Double��
                                       //?super�࣬���÷������ޣ�����������ʹ��
	                                   //?super String ��ζ��ֻ������String�������ĸ���Object
}
