package 反射机制2;

public class A {
	private String title;
	private double price;
	public A( String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "图书名称："+this.title+"，价格："+this.price;
	}

}
