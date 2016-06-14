package cui.string;

class Book{
	private String title;
	private double price;
	public Book(){
		System.out.println("一个新的Book类对象产生");
	}
	public Book(String title){
		System.out.println("一个新的Book类对象产生");
		this.title=title;
		
	}
	public Book(String title,double price){
		System.out.println("一个新的Book类对象产生");
		this.title=title;
		this.price=price;
		
	}
	public String getInfo(){
		return "书名："+this.title+"，价格"+this.price;
	}
}

public class Guanjianzi2diaoyong {
	public static void main(String args[]){
		Book book=new Book("java",1999.9);
		System.out.println(book.getInfo());
	}

}
