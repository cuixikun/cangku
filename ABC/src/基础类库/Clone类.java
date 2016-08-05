package 基础类库;
class Bk implements Cloneable{
	private String title;
	private double price;
	public Bk(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "书名："+this.title+"，价格："+this.price;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();//调用父类的克隆方法
	}
}
public class Clone类 {
	public static void main(String args[]) throws Exception{
		Bk bka = new Bk("java开发",79.0);
		Bk bkb = (Bk) bka.clone();
		System.out.println(bka);
		System.out.println(bkb);
	}

}
