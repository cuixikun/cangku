package cui.string;

class Book{
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String getInfo(){
		return "������"+this.title+"���۸�"+this.price;
	}
}

public class Guanjianzi {
	public static void main(String args[]){
		Book book=new Book("java",1999.9);
		System.out.println(book.getInfo());
	}

}
