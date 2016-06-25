package cui.string;

class Link1{
	private class Node{
		private String data;//��������
		private Node next;//���ù�ϵ
		public Node(String data){
			this.data=data;
		}
		public void addNode(Node newNode){
			if(this.next==null){//��ǰ���¸��ڵ�Ϊ��
				this.next=newNode;
			}else{//����������
				this.next.addNode(newNode);
			}
		}
		public boolean containsNode(String data){
			//�ж�ʱ����equals���Ƚ�ʱ���û�compare
			if(data.equals(this.data)){//��ǰ�ڵ�ΪҪ��ѯ������
				return true;//���治�ٲ�ѯ
			}else{
				if(this.next!=null){
					return this.next.containsNode(data);
				}else{
					return false;
				}
				
			}
		}
	}
	//----------------------------����Ϊ�ڲ���--------------------------------------------
	private Node root;//��Ҫ���ڵ�
	private int count=0;//����Ԫ�صĸ���
	public void add(String data){
		if(data==null){//���費�����
			return;
		}
		Node newNode=new Node(data);//Ҫ���������
		if(this.root==null){//��ǰû�и��ڵ�
			this.root=newNode;//������ڵ�
		}else{//���ڵ���ڣ���������Node����
			this.root.addNode(newNode);
		}
		this.count++;//ÿһ�α�����ɺ�������+1
	}
	public int size(){//ȡ�ñ����������
		return this.count;
	}
	public boolean isEmpty(){
		return this.count==0;
	}
	public boolean contains(String data){
		if(data==null||this.root==null){
			return false;
		}
		return this.root.containsNode(data);
	}
}

public final class Lianbiao4 {
	public static void main(String args[]){
		Link1 all=new Link1();
		System.out.println(all.isEmpty());
		all.add("hello");
		all.add("world");
		all.add(null);
		System.out.println(all.size());
		System.out.println(all.isEmpty());
		System.out.println(all.contains("hello"));
		System.out.println(all.contains("Hello"));
	}

}
