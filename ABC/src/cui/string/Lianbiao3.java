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
class Link{//�������ݵ����������
	private Node root;//���ڵ�
	public void add(String data){//��������
	}
	public void print(){//�������
		
	}
}

public class Lianbiao3 {
	public static void main(String args[]){
		Link link=new Link();
		link.add("hello");//�������
		link.add("hello���");//�������
		link.add("helloû��");//�������
		link.print();//չʾ����
	}

}
