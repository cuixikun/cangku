package cui.string;

class Node{
	private String data;
	private Node next;
	public Node(String data){
		this.data=data;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Node getNext(){
		return this.next;
	}
	public String getData(){
		return this.data;
	}
} 
class Link{//负责数据的设置与输出
	private Node root;//根节点
	public void add(String data){//增加数据
	}
	public void print(){//输出数据
		
	}
}

public class Lianbiao3 {
	public static void main(String args[]){
		Link link=new Link();
		link.add("hello");//存放数据
		link.add("hello你好");//存放数据
		link.add("hello没事");//存放数据
		link.print();//展示数据
	}

}
