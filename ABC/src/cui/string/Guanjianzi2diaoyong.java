package cui.string;

class Book{
	private String title;
	private double price;
	public Book(){
		System.out.println("һ���µ�Book��������");
	}
	public Book(String title){
		System.out.println("һ���µ�Book��������");
		this.title=title;
		
	}
	public Book(String title,double price){
		System.out.println("һ���µ�Book��������");
		this.title=title;
		this.price=price;
		
	}
	public String getInfo(){
		return "������"+this.title+"���۸�"+this.price;
	}
}

public class Guanjianzi2diaoyong {
	public static void main(String args[]){
		Book book=new Book("java",1999.9);
		System.out.println(book.getInfo());
	}

}
