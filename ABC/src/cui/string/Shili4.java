package cui.string;

class Item{
	private int iid;
	private String name;
	private String note;
	private Subitem subitems[];
	private Product products[];
	public Item(int iid,String name,String note){
		this.iid=iid;
		this.name=name;
		this.note=note;
	}
	public void setSubitems(Subitem subitems[]){
		this.subitems=subitems;
	}
	public Subitem [] getSubitems(){
		return this.subitems;
	}
	public void setProducts(Product products[]){
		this.products=products;
	}
	public Product [] getProducts(){
		return this.products;
	}
	
	public String getInfo(){
		return "��Ŀ��ţ�"+this.iid+"�����ƣ�"+this.name+"��������"+this.note;
	}
}
class Subitem{
	private int sid;
	private String name;
	private String note;
	private Item item;
	private Product products[];
	public Subitem(int sid,String name,String note){
		this.sid=sid;
		this.name=name;
		this.note=note;
	}
	public void setItem(Item item){
		this.item=item;
	}
	
	public Item getItem(){
		return this.item;
	}
	public void setProducts(Product products[]){
		this.products=products;
	}
	public Product [] getProducts(){
		return this.products;
	}
	public String getInfo(){
		return "����Ŀ��ţ�"+this.sid+"�����ƣ�"+this.name+"��������"+this.note;
	}
}
class Product{
	private int pid;
	private String name;
	private double price;
	private Item item;
	private Subitem subitem;
	public Product(int pid,String name,double price){
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	public void setItem(Item item){
		this.item=item;
	}
	
	public Item getItem(){
		return this.item;
	}
	public void setSubitems(Subitem subitem){
		this.subitem=subitem;
	}
	public Subitem getSubitem(){
		return this.subitem;
	}
	public String getInfo(){
		return "��Ʒ��ţ�"+this.pid+"�����ƣ�"+this.name+"���۸�"+this.price;
	}
}

public class Shili4 {
	public static void main(String args[]){
		Item item=new Item(1,"TokyoHot","...");
		Subitem suba=new Subitem(101,"����",",,,");
		Subitem subb=new Subitem(102,"����","������");
		Subitem subc=new Subitem(103,"��ʿ","***");
		Product proa=new Product(1001,"C��",10.0);
		Product prob=new Product(1002,"����",100.0);
		Product proc=new Product(1003,"���Ķ�",1000.0);
		Product prod=new Product(1004,"ղķ˹",0.0);
		suba.setItem(item);
		subb.setItem(item);
		subc.setItem(item);
		item.setSubitems(new Subitem[]{suba,subb,subc});
		proa.setSubitems(suba);
		proa.setItem(item);
		prob.setSubitems(suba);
		prob.setItem(item);
		proc.setSubitems(subb);
		proc.setItem(item);
		prod.setSubitems(subc);
		prod.setItem(item);
		suba.setProducts(new Product[] {proa,prob});
		subb.setProducts(new Product[] {proc});
		subc.setProducts(new Product[] {prod});
		item.setProducts(new Product[]{proa,prob,proc,prod});
		System.out.println(item.getInfo());
		for(int x=0;x<item.getSubitems().length;x++){
			System.out.println(item.getSubitems()[x].getInfo());
		}
		System.out.println("--------------------------------");
		System.out.println(item.getInfo());
		for(int x=0;x<item.getProducts().length;x++){
			System.out.println("\t"+item.getProducts()[x].getInfo());
			System.out.println("\t\t"+item.getProducts()[x].getSubitem().getInfo());
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(suba.getInfo());
		for(int x=0;x<suba.getProducts().length;x++){
			System.out.println(suba.getProducts()[x].getInfo());
		}
	}

}
