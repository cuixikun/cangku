package cui.string;

class Book{
	private String title;
	private double price;
	public Book(){
		System.out.println("һ���µ�Book��������");
	}
	public Book(String title){
		this();//���ñ�����޲ι���
		this.title=title;
		
	}
	public Book(String title,double price){
		this(title);//���ñ���ĵ��ι���
		this.price=price;
		
	}
	public String getInfo(){
		return "������"+this.title+"���۸�"+this.price;
	}
}

public class Guanjianzi3 {
	public static void main(String args[]){
		Book book=new Book("java",1999.9);
		System.out.println(book.getInfo());
	}

}
