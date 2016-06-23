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
		Node root=new Node("��ͷ");
		Node root1=new Node("����1");
		Node root2=new Node("����2");
		root.setNext(root1);
		root1.setNext(root2);
		print(root);
	}
	public static void print(Node current){
		if(current==null){
			return;//��������
		}
		System.out.println(current.getData());
		print(current.getNext());
	}

}

