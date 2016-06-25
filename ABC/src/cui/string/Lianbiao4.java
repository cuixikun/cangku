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
	}
	//----------------------------以上为内部类--------------------------------------------
	private Node root;//需要根节点
	private int count=0;//保存元素的个数
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
