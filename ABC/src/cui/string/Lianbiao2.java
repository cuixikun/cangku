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

public class Lianbiao2 {
	public static void main(String args[]){
		Node root=new Node("火车头");
		Node root1=new Node("车厢1");
		Node root2=new Node("车厢2");
		root.setNext(root1);
		root1.setNext(root2);
		print(root);
	}
	public static void print(Node current){
		if(current==null){
			return;//结束方法
		}
		System.out.println(current.getData());
		print(current.getNext());
	}

}

