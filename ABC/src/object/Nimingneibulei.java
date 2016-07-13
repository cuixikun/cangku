package object;

interface Message{
	public void print();
}
public class Nimingneibulei {
	public static void main(String args[]){
		fun(new Message(){
			public void print(){//匿名内部类
				System.out.println("hello world");
			}
		}//
        );
	}
		public static void fun(Message msg){
			msg.print();
		}
	}


