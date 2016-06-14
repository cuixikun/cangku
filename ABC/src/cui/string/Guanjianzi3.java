package cui.string;

class Book{
	private String title;
	private double price;
	public Book(){
		System.out.println("一个新的Book类对象产生");
	}
	public Book(String title){
		this();//调用本类的无参构造
		this.title=title;
		
	}
	public Book(String title,double price){
		this(title);//调用本类的单参构造
		this.price=price;
		
	}
	public String getInfo(){
		return "书名："+this.title+"，价格"+this.price;
	}
}

public class Guanjianzi3 {
	public static void main(String args[]){
		Book book=new Book("java",1999.9);
		System.out.println(book.getInfo());
	}

}
