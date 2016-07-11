package cui.string;

class Link10{
	private class Node{
		private Object data;//保存数据
		private Node next;//引用关系
		public Node(Object data){
			this.data=data;
		}
		public void addNode(Node newNode){
			if(this.next==null){//当前的下个节点为空
				this.next=newNode;
			}else{//向后继续保存
				this.next.addNode(newNode);
			}
		}
		public boolean containsNode(Object data){
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
		public Object getNode(int index){
			if(Link10.this.foot++==index){
				return this.data;
			}else{
				return this.next.getNode(index);
				//根据索引查数据
			}
		}
		public void setNode(int index,Object data){
			if(Link10.this.foot++==index){
				this.data=data;//进行内容的修改
			}else{
				this.next.setNode(index,data);
			}
		}
		//第一次调用Link10，previous=link.root,this=link.root.next
		//第二次调用Node,previous=ink.root.next,this=ink.root.next.next
		//要传递上一个节点以及要删除的数据
		public void removeNode(Node previous,Object data){
			if(data.equals(this.data)){//当前节点为删除节点
				previous.next=this.next;
			}else{//应该向后继续查询
				this.next.removeNode(this,data);
			}
		}
		//第一次调用link：this=link.root
		//第二次调用node：this=link.root.next
		public void toArrayNode(){
			Link10.this.returnArray[Link10.this.foot++]=this.data;
			if(this.next!=null){
				this.next.toArrayNode();
			}
		}
	}
	//----------------------------以上为内部类--------------------------------------------
	private Node root;//需要根节点
	private int count=0;//保存元素的个数
	private int foot=0;
	private Object[] returnArray;
	public void add(Object data){
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
	public Object get(int index){
		if(index>this.count){//超过查询范围
			return null;//没有数据
		}
		this.foot=0;//表示从前向后查询
		return this.root.getNode(index);
	}
	public boolean contains(Object data){
		if(data==null||this.root==null){
			return false;
		}
		return this.root.containsNode(data);
	}
	public void set(int index,Object data){
		if(index>this.count){
			return;
		}
		this.foot=0;//重新设置foot属性内容，作为索引出现
		this.root.setNode(index,data);
	}
	public void remove(Object data){
		if(this.contains(data)){
			//root是Node类对象，此处直接访问了内部类的私有操作
			if(data.equals(this.root.data)){//为要删除节点
				this.root=this.root.next;//空出当前根节点
			}else{
				this.root.next.removeNode(this.root,data);
			}
			
		}
	}
	public Object [] toArray(){
		if(this.root==null){
			return null;
		}else{
			this.foot=0;//控制脚标
			this.returnArray=new Object[this.count];
			this.root.toArrayNode();//交给node类处理
			return this.returnArray;
		}
	}
}

interface Pet{//定义一个宠物标准
	public String getName();//得到宠物名字
	public int getAge();//的到宠物年龄
}
class PetShop{//一个宠物商店要保存多个宠物信息
	private Link10 pets=new Link10();//保存的宠物信息
	public void add(Pet pet){//上架
		this.pets.add(pet);//向集合里保存数据
	}
	public void delete(Pet pet){//下架
		this.pets.remove(pet);
	}
	//模糊查询一定是返回多个内容，不知道多少个，返回link即可
	public Link10 search(String keyWord){
		Link10 result=new Link10();//保存结果
		///将集合变为对象数组的形式返回，因为集合保存的是object
		//但是真正要查询的数据在Pet接口对象的的getName()方法的返回值
		Object obj[]=this.pets.toArray();
		for(int x=0;x<obj.length;x++){
			Pet p=(Pet) obj[x];
			if(p.getName().contains(keyWord)){//查询到了
				result.add(p);//保存满足条件的结果
			}
		}
		return result;
	}
}
class Cat implements Pet{//如果不实现接口无法保存宠物信息
	private String name;
	private int age;
	public Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(!(obj instanceof Cat)){
			return false;
		}
		Cat c=(Cat) obj;
		if(this.name.equals(c.name)&&this.age==c.age){
			return true;
		}
		return false;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return "猫的名字："+this.name+"，猫的年龄："+this.age;
	}
}
class Dog implements Pet{
	private String name;
	private int age;
	public Dog(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(!(obj instanceof Dog)){
			return false;
		}
		Dog c=(Dog) obj;
		if(this.name.equals(c.name)&&this.age==c.age){
			return true;
		}
		return false;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return "狗的名字："+this.name+"，狗的年龄："+this.age;
	}
}

public class Chongwushangdian {
    public static void main(String args[]){
		PetShop shop=new PetShop();
		shop.add(new Cat("小蓝猫",3));
		shop.add(new Cat("小红猫",4));
		shop.add(new Cat("波斯猫",5));
		shop.add(new Dog("小狗",3));
		shop.add(new Dog("大狗猫",5));
		shop.add(new Dog("哮天犬",1000000));
		shop.delete(new Dog("小狗",3));
		Link10 all=shop.search("小");
		Object obj[]=all.toArray();
		for(int x=0;x<obj.length;x++){
			System.out.println(obj[x]);
		}
	}

}
