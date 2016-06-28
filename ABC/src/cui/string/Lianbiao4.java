package cui.string;

class Link1{
	private class Node{
		private String data;//保存数据
		private Node next;//引用关系
		public Node(String data){
			this.data=data;
		}
		public void addNode(Node newNode){
			if(this.next==null){//当前的下个节点为空
				this.next=newNode;
			}else{//向后继续保存
				this.next.addNode(newNode);
			}
		}
		public boolean containsNode(String data){
			//判断时候用equals，比较时候用户compare
			if(data.equals(this.data)){//当前节点为要查询的数据
				return true;//后面不再查询
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
				//根据索引查数据
			}
		}
		public void setNode(int index,String data){
			if(Link1.this.foot++==index){
				this.data=data;//进行内容的修改
			}else{
				this.next.setNode(index,data);
			}
		}
		//第一次调用link1，previous=link.root,this=link.root.next
		//第二次调用Node,previous=ink.root.next,this=ink.root.next.next
		//要传递上一个节点以及要删除的数据
		public void removeNode(Node previous,String data){
			if(data.equals(this.data)){//当前节点为删除节点
				previous.next=this.next;
			}else{//应该向后继续查询
				this.next.removeNode(this,data);
			}
		}
	}
	//----------------------------以上为内部类--------------------------------------------
	private Node root;//需要根节点
	private int count=0;//保存元素的个数
	private int foot=0;
	public void add(String data){
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
	public String get(int index){
		if(index>this.count){//超过查询范围
			return null;//没有数据
		}
		this.foot=0;//表示从前向后查询
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
		this.foot=0;//重新设置foot属性内容，作为索引出现
		this.root.setNode(index,data);
	}
	public void remove(String data){
		if(this.contains(data)){
			//root是Node类对象，此处直接访问了内部类的私有操作
			if(data.equals(this.root.data)){//为要删除节点
				this.root=this.root.next;//空出当前根节点
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
		all.set(1,"你好");//修改数据
		all.remove("world");
		System.out.println(all.size());//元素个数
		System.out.println(all.isEmpty());
		System.out.println(all.contains("hello"));
		System.out.println(all.contains("Hello"));
		System.out.println(all.get(1));
		System.out.println(all.get(10));//索引
		System.out.println(all.get(1));//删除
	}

}
