package cui.string;

class Link10{
	private class Node{
		private Object data;//��������
		private Node next;//���ù�ϵ
		public Node(Object data){
			this.data=data;
		}
		public void addNode(Node newNode){
			if(this.next==null){//��ǰ���¸��ڵ�Ϊ��
				this.next=newNode;
			}else{//����������
				this.next.addNode(newNode);
			}
		}
		public boolean containsNode(Object data){
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
		public Object getNode(int index){
			if(Link10.this.foot++==index){
				return this.data;
			}else{
				return this.next.getNode(index);
				//��������������
			}
		}
		public void setNode(int index,Object data){
			if(Link10.this.foot++==index){
				this.data=data;//�������ݵ��޸�
			}else{
				this.next.setNode(index,data);
			}
		}
		//��һ�ε���Link10��previous=link.root,this=link.root.next
		//�ڶ��ε���Node,previous=ink.root.next,this=ink.root.next.next
		//Ҫ������һ���ڵ��Լ�Ҫɾ��������
		public void removeNode(Node previous,Object data){
			if(data.equals(this.data)){//��ǰ�ڵ�Ϊɾ���ڵ�
				previous.next=this.next;
			}else{//Ӧ����������ѯ
				this.next.removeNode(this,data);
			}
		}
		//��һ�ε���link��this=link.root
		//�ڶ��ε���node��this=link.root.next
		public void toArrayNode(){
			Link10.this.returnArray[Link10.this.foot++]=this.data;
			if(this.next!=null){
				this.next.toArrayNode();
			}
		}
	}
	//----------------------------����Ϊ�ڲ���--------------------------------------------
	private Node root;//��Ҫ���ڵ�
	private int count=0;//����Ԫ�صĸ���
	private int foot=0;
	private Object[] returnArray;
	public void add(Object data){
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
	public Object get(int index){
		if(index>this.count){//������ѯ��Χ
			return null;//û������
		}
		this.foot=0;//��ʾ��ǰ����ѯ
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
		this.foot=0;//��������foot�������ݣ���Ϊ��������
		this.root.setNode(index,data);
	}
	public void remove(Object data){
		if(this.contains(data)){
			//root��Node����󣬴˴�ֱ�ӷ������ڲ����˽�в���
			if(data.equals(this.root.data)){//ΪҪɾ���ڵ�
				this.root=this.root.next;//�ճ���ǰ���ڵ�
			}else{
				this.root.next.removeNode(this.root,data);
			}
			
		}
	}
	public Object [] toArray(){
		if(this.root==null){
			return null;
		}else{
			this.foot=0;//���ƽű�
			this.returnArray=new Object[this.count];
			this.root.toArrayNode();//����node�ദ��
			return this.returnArray;
		}
	}
}

interface Pet{//����һ�������׼
	public String getName();//�õ���������
	public int getAge();//�ĵ���������
}
class PetShop{//һ�������̵�Ҫ������������Ϣ
	private Link10 pets=new Link10();//����ĳ�����Ϣ
	public void add(Pet pet){//�ϼ�
		this.pets.add(pet);//�򼯺��ﱣ������
	}
	public void delete(Pet pet){//�¼�
		this.pets.remove(pet);
	}
	//ģ����ѯһ���Ƿ��ض�����ݣ���֪�����ٸ�������link����
	public Link10 search(String keyWord){
		Link10 result=new Link10();//������
		///�����ϱ�Ϊ�����������ʽ���أ���Ϊ���ϱ������object
		//��������Ҫ��ѯ��������Pet�ӿڶ���ĵ�getName()�����ķ���ֵ
		Object obj[]=this.pets.toArray();
		for(int x=0;x<obj.length;x++){
			Pet p=(Pet) obj[x];
			if(p.getName().contains(keyWord)){//��ѯ����
				result.add(p);//�������������Ľ��
			}
		}
		return result;
	}
}
class Cat implements Pet{//�����ʵ�ֽӿ��޷����������Ϣ
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
		return "è�����֣�"+this.name+"��è�����䣺"+this.age;
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
		return "�������֣�"+this.name+"���������䣺"+this.age;
	}
}

public class Chongwushangdian {
    public static void main(String args[]){
		PetShop shop=new PetShop();
		shop.add(new Cat("С��è",3));
		shop.add(new Cat("С��è",4));
		shop.add(new Cat("��˹è",5));
		shop.add(new Dog("С��",3));
		shop.add(new Dog("��è",5));
		shop.add(new Dog("����Ȯ",1000000));
		shop.delete(new Dog("С��",3));
		Link10 all=shop.search("С");
		Object obj[]=all.toArray();
		for(int x=0;x<obj.length;x++){
			System.out.println(obj[x]);
		}
	}

}
