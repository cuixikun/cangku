package java������1;
interface H<C>{
	public C create(String t,double p);
}
class Book{
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "������"+this.title+"���۸�"+this.price;
	}
}
public class Fangfayinyong4 {
	public static void main(String args[]){
		H<Book> h=Book::new;
		//���õ���Ȼ��create(),��������������õ�Book��Ĺ���
		Book book=h.create("java", 20.2);
		System.out.println(book);
	}

}
