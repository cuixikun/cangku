package abcd;



class Book{
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String getInfo(){
		return "ͼ�����ƣ�"+this.title+"���۸�"+this.price;
	}
	public boolean compare(Book book){
		if(this==book){
			return true;
		}
		if(book==null){
			return false;
		}
		if(this.title.equals(book.title)&&this.price==book.price){
			return true;
		}
		return false;
	}
}

class Link1{
	private class Node{
		private Book data;//��������
		private Node next;//���ù�ϵ
		public Node(Book data){
			this.data=data;
		}
		public void addNode(Node newNode){
			if(this.next==null){//��ǰ���¸��ڵ�Ϊ��
				this.next=newNode;
			}else{//����������
				this.next.addNode(newNode);
			}
		}
		public boolean containsNode(Book data){
			//�ж�ʱ����equals���Ƚ�ʱ���û�compare
			if(data.compare(this.data)){//��ǰ�ڵ�ΪҪ��ѯ������
				return true;//���治�ٲ�ѯ
			}else{
				if(this.next!=null){
					return this.next.containsNode(data);
				}else{
					return false;
				}
				
			}
		}
		public Book getNode(int index){
			if(Link1.this.foot++==index){
				return this.data;
			}else{
				return this.next.getNode(index);
				//��������������
			}
		}
		public void setNode(int index,Book data){
			if(Link1.this.foot++==index){
				this.data=data;//�������ݵ��޸�
			}else{
				this.next.setNode(index,data);
			}
		}
		//��һ�ε���link1��previous=link.root,this=link.root.next
		//�ڶ��ε���Node,previous=ink.root.next,this=ink.root.next.next
		//Ҫ������һ���ڵ��Լ�Ҫɾ��������
		public void removeNode(Node previous,Book data){
			if(data.compare(this.data)){//��ǰ�ڵ�Ϊɾ���ڵ�
				previous.next=this.next;
			}else{//Ӧ����������ѯ
				this.next.removeNode(this,data);
			}
		}
		//��һ�ε���link��this=link.root
		//�ڶ��ε���node��this=link.root.next
		public void toArrayNode(){
			Link1.this.returnArray[Link1.this.foot++]=this.data;
			if(this.next!=null){
				this.next.toArrayNode();
			}
		}
	}
	//----------------------------����Ϊ�ڲ���--------------------------------------------
	private Node root;//��Ҫ���ڵ�
	private int count=0;//����Ԫ�صĸ���
	private int foot=0;
	private Book[] returnArray;
	public void add(Book data){
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
	public Book get(int index){
		if(index>this.count){//������ѯ��Χ
			return null;//û������
		}
		this.foot=0;//��ʾ��ǰ����ѯ
		return this.root.getNode(index);
	}
	public boolean contains(Book data){
		if(data==null||this.root==null){
			return false;
		}
		return this.root.containsNode(data);
	}
	public void set(int index,Book data){
		if(index>this.count){
			return;
		}
		this.foot=0;//��������foot�������ݣ���Ϊ��������
		this.root.setNode(index,data);
	}
	public void remove(Book data){
		if(this.contains(data)){
			//root��Node����󣬴˴�ֱ�ӷ������ڲ����˽�в���
			if(data.compare(this.root.data)){//ΪҪɾ���ڵ�
				this.root=this.root.next;//�ճ���ǰ���ڵ�
			}else{
				this.root.next.removeNode(this.root,data);
			}
			
		}
	}
	public Book [] toArray(){
		if(this.root==null){
			return null;
		}else{
			this.foot=0;//���ƽű�
			this.returnArray=new Book[this.count];
			this.root.toArrayNode();//����node�ദ��
			return this.returnArray;
		}
	}
}


public  class Lianbiao {
	public static void main(String args[]){
		Link1 all=new Link1();
		all.add(new Book("��ѧ",19.0));
		all.add(new Book("С��ѧ",199.0));
		all.add(new Book("��ѧ",1999.0));
		System.out.println("������ĸ���:"+all.size());
		System.out.println(all.contains(new Book("��ѧ",19.0)));
		all.remove(new Book("С��ѧ",199.0));
		Book[] books=all.toArray();
		for(int x=0;x<books.length;x++){
			System.out.println(books[x].getInfo());
		}
	}
}
	


