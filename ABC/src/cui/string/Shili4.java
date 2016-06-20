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
		return "栏目编号："+this.iid+"，名称："+this.name+"，描述："+this.note;
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
		return "子栏目编号："+this.sid+"，名称："+this.name+"，描述："+this.note;
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
		return "商品编号："+this.pid+"，名称："+this.name+"，价格："+this.price;
	}
}

public class Shili4 {
	public static void main(String args[]){
		Item item=new Item(1,"TokyoHot","...");
		Subitem suba=new Subitem(101,"皇马",",,,");
		Subitem subb=new Subitem(102,"曼联","￥￥￥");
		Subitem subc=new Subitem(103,"骑士","***");
		Product proa=new Product(1001,"C罗",10.0);
		Product prob=new Product(1002,"贝尔",100.0);
		Product proc=new Product(1003,"马夏尔",1000.0);
		Product prod=new Product(1004,"詹姆斯",0.0);
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
