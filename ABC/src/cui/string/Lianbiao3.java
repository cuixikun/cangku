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
	public void addNode(Node newNode){
		if(this.next==null){
			this.next=newNode;
		}else{
			this.next.addNode(newNode);
		}
		
	}
		public void printNode(){
			System.out.println(this.data);
			if(this.next!=null){
				this.next.printNode();
			}
		}
	}
 
class Link{//负责数据的设置与输出
	private Node root;//根节点
	public void add(String data){//增加数据
		//为了设计数据的先后顺序
		Node newNode=new Node(data);
		if(this.root==null){
			this.root=newNode;
		}else{
			this.root.addNode(newNode);
		}
	}
	public void print(){//输出数据
		if(this.root!=null)
			this.root.printNode();
		
	}
}

public class Lianbiao3 {
	public static void main(String args[]){
		Link link=new Link();
		link.add("hello");//存放数据
		link.add("hellohj");//存放数据
		link.add("hellod");//存放数据
		link.print();//展示数据
	}

}
