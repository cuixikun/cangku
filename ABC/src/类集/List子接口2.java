package �༯;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(!(obj instanceof Book)){
			return false;
		}
		Book book = (Book) obj;
		if(this.title.equals(book.title)&&this.price==book.price){
			return true;
		}
		return false;
	}
	public String toString(){
		return "������"+this.title+"���۸�"+this.price;
	}
}
public class List�ӽӿ�2 {
	public static void main(String args[]) throws Exception{
		List<Book> all = new ArrayList<Book>();
		all.add(new Book("java����",10.0));
		all.add(new Book("jsp����",10.1));
		all.add(new Book("oracle����",10.3));
		//�κ���״�¼������ݵ�ɾ�������ݵĲ�ѯ���������ṩequals()����
		all.remove(new Book("oracle����",10.3));
		System.out.println(all);
	}

}
