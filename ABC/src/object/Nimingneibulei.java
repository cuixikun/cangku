package object;

interface Message{
	public void print();
}
public class Nimingneibulei {
	public static void main(String args[]){
		fun(new Message(){
			public void print(){//�����ڲ���
				System.out.println("hello world");
			}
		}//
        );
	}
		public static void fun(Message msg){
			msg.print();
		}
	}


