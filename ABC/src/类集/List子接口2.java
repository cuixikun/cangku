package 类集;

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
		return "书名："+this.title+"，价格："+this.price;
	}
}
public class List子接口2 {
	public static void main(String args[]) throws Exception{
		List<Book> all = new ArrayList<Book>();
		all.add(new Book("java开发",10.0));
		all.add(new Book("jsp开发",10.1));
		all.add(new Book("oracle开发",10.3));
		//任何情状下集合数据的删除和内容的查询，都必须提供equals()方法
		all.remove(new Book("oracle开发",10.3));
		System.out.println(all);
	}

}
