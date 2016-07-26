package java新特性1;
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
		return "书名："+this.title+"，价格："+this.price;
	}
}
public class Fangfayinyong4 {
	public static void main(String args[]){
		H<Book> h=Book::new;
		//调用的虽然是create(),但是这个方法引用的Book类的构造
		Book book=h.create("java", 20.2);
		System.out.println(book);
	}

}
