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
		public String getNode(int index){
			if(Link1.this.foot++==index){
				return this.data;
			}else{
				return this.next.getNode(index);
				//��������������
			}
		}
		public void setNode(int index,String data){
			if(Link1.this.foot++==index){
				this.data=data;//�������ݵ��޸�
			}else{
				this.next.setNode(index,data);
			}
		}
		//��һ�ε���link1��previous=link.root,this=link.root.next
		//�ڶ��ε���Node,previous=ink.root.next,this=ink.root.next.next
		//Ҫ������һ���ڵ��Լ�Ҫɾ��������
		public void removeNode(Node previous,String data){
			if(data.equals(this.data)){//��ǰ�ڵ�Ϊɾ���ڵ�
				previous.next=this.next;
			}else{//Ӧ����������ѯ
				this.next.removeNode(this,data);
			}
		}
	}
	//----------------------------����Ϊ�ڲ���--------------------------------------------
	private Node root;//��Ҫ���ڵ�
	private int count=0;//����Ԫ�صĸ���
	private int foot=0;
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
	public String get(int index){
		if(index>this.count){//������ѯ��Χ
			return null;//û������
		}
		this.foot=0;//��ʾ��ǰ����ѯ
		return this.root.getNode(index);
	}
	public boolean contains(String data){
		if(data==null||this.root==null){
			return false;
		}
		return this.root.containsNode(data);
	}
	public void set(int index,String data){
		if(index>this.count){
			return;
		}
		this.foot=0;//��������foot�������ݣ���Ϊ��������
		this.root.setNode(index,data);
	}
	public void remove(String data){
		if(this.contains(data)){
			//root��Node����󣬴˴�ֱ�ӷ������ڲ����˽�в���
			if(data.equals(this.root.data)){//ΪҪɾ���ڵ�
				this.root=this.root.next;//�ճ���ǰ���ڵ�
			}else{
				this.root.next.removeNode(this.root,data);
			}
			
		}
	}
}

public final class Lianbiao4 {
	public static void main(String args[]){
		Link1 all=new Link1();
		System.out.println(all.isEmpty());
		all.add("hello");
		all.add("world");
		all.add("wd");
		all.add(null);
		all.set(1,"���");//�޸�����
		all.remove("world");
		System.out.println(all.size());//Ԫ�ظ���
		System.out.println(all.isEmpty());
		System.out.println(all.contains("hello"));
		System.out.println(all.contains("Hello"));
		System.out.println(all.get(1));
		System.out.println(all.get(10));//����
		System.out.println(all.get(1));//ɾ��
	}

}
