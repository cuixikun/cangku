package 比较器;

import java.util.Arrays;
import java.util.Comparator;

class Book {
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "书名："+this.title+"，价格："+this.price+"\n";
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getTitle(){
		return title;
	}
	public double getPrice(){
		return price;
	}
}
class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPrice()>o2.getPrice()){
			return 1;
		}else if(o1.getPrice()<o2.getPrice()){
			return -1;
		}else{
		return 0;
		}
	}
}

public class Comparator接口 {
	public static void main(String args[]) throws Exception{
		Book books[]=new Book[]{
				new Book("java",11.1),
				new Book("jsp",111.1),
				new Book("ios",1111.1),
				new Book("aha",11111.1),
		};
		Arrays.sort(books,new BookComparator());
		System.out.println(Arrays.toString(books));
	}

}
