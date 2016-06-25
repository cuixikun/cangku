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
 
class Link{//�������ݵ����������
	private Node root;//���ڵ�
	public void add(String data){//��������
		//Ϊ��������ݵ��Ⱥ�˳��
		Node newNode=new Node(data);
		if(this.root==null){
			this.root=newNode;
		}else{
			this.root.addNode(newNode);
		}
	}
	public void print(){//�������
		if(this.root!=null)
			this.root.printNode();
		
	}
}

public class Lianbiao3 {
	public static void main(String args[]){
		Link link=new Link();
		link.add("hello");//�������
		link.add("hellohj");//�������
		link.add("hellod");//�������
		link.print();//չʾ����
	}

}
