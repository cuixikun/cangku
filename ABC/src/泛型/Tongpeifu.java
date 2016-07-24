package 泛型;
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
	public static void fun(Message<?> temp){//在?通配符的的基础上会有两个子类的通配符
		System.out.println(temp.getMsg());//?extends类，设置泛型上限，可以在声明上和方法参数上使用
	}                                    //?extends Number,意味着可以设置number或number的子类（Integer, Double）
                                       //?super类，设置泛型下限，方法参数上使用
	                                   //?super String 意味着只能设置String或者他的父类Object
}
