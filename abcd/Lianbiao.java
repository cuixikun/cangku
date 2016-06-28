package abcd;



class Book{
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String getInfo(){
		return "图书名称："+this.title+"。价格："+this.price;
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
		private Book data;//保存数据
		private Node next;//引用关系
		public Node(Book data){
			this.data=data;
		}
		public void addNode(Node newNode){
			if(this.next==null){//当前的下个节点为空
				this.next=newNode;
			}else{//向后继续保存
				this.next.addNode(newNode);
			}
		}
		public boolean containsNode(Book data){
			//判断时候用equals，比较时候用户compare
			if(data.compare(this.data)){//当前节点为要查询的数据
				return true;//后面不再查询
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
				//根据索引查数据
			}
		}
		public void setNode(int index,Book data){
			if(Link1.this.foot++==index){
				this.data=data;//进行内容的修改
			}else{
				this.next.setNode(index,data);
			}
		}
		//第一次调用link1，previous=link.root,this=link.root.next
		//第二次调用Node,previous=ink.root.next,this=ink.root.next.next
		//要传递上一个节点以及要删除的数据
		public void removeNode(Node previous,Book data){
			if(data.compare(this.data)){//当前节点为删除节点
				previous.next=this.next;
			}else{//应该向后继续查询
				this.next.removeNode(this,data);
			}
		}
		//第一次调用link：this=link.root
		//第二次调用node：this=link.root.next
		public void toArrayNode(){
			Link1.this.returnArray[Link1.this.foot++]=this.data;
			if(this.next!=null){
				this.next.toArrayNode();
			}
		}
	}
	//----------------------------以上为内部类--------------------------------------------
	private Node root;//需要根节点
	private int count=0;//保存元素的个数
	private int foot=0;
	private Book[] returnArray;
	public void add(Book data){
		if(data==null){//假设不允许空
			return;
		}
		Node newNode=new Node(data);//要保存的数据
		if(this.root==null){//当前没有根节点
			this.root=newNode;//保存根节点
		}else{//根节点存在，其他交给Node处理
			this.root.addNode(newNode);
		}
		this.count++;//每一次保存完成后数据量+1
	}
	public int size(){//取得保存的数据量
		return this.count;
	}
	public boolean isEmpty(){
		return this.count==0;
	}
	public Book get(int index){
		if(index>this.count){//超过查询范围
			return null;//没有数据
		}
		this.foot=0;//表示从前向后查询
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
		this.foot=0;//重新设置foot属性内容，作为索引出现
		this.root.setNode(index,data);
	}
	public void remove(Book data){
		if(this.contains(data)){
			//root是Node类对象，此处直接访问了内部类的私有操作
			if(data.compare(this.root.data)){//为要删除节点
				this.root=this.root.next;//空出当前根节点
			}else{
				this.root.next.removeNode(this.root,data);
			}
			
		}
	}
	public Book [] toArray(){
		if(this.root==null){
			return null;
		}else{
			this.foot=0;//控制脚标
			this.returnArray=new Book[this.count];
			this.root.toArrayNode();//交给node类处理
			return this.returnArray;
		}
	}
}


public  class Lianbiao {
	public static void main(String args[]){
		Link1 all=new Link1();
		all.add(new Book("化学",19.0));
		all.add(new Book("小化学",199.0));
		all.add(new Book("大化学",1999.0));
		System.out.println("保存书的个数:"+all.size());
		System.out.println(all.contains(new Book("化学",19.0)));
		all.remove(new Book("小化学",199.0));
		Book[] books=all.toArray();
		for(int x=0;x<books.length;x++){
			System.out.println(books[x].getInfo());
		}
	}
}
	


