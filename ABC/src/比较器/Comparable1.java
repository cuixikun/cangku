package �Ƚ���;

import java.util.Arrays;

class Book implements Comparable<Book>{//ʵ�ֱȽ�
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "������"+this.title+"���۸�"+this.price+"\n";
	}
	@Override
	public int compareTo(Book o) {//Arrays.sort()���Զ����ô˷����Ƚ�
		if(this.price>o.price){
			return -1;
		}else if(this.price<o.price){
			return 1;
		}else{
		return 0;
		}
	}
}
public class Comparable1 {
	public static void main(String args[]) throws Exception{
		Book books[]=new Book[]{
				new Book("java",11.1),
				new Book("jsp",111.1),
				new Book("ios",1111.1),
				new Book("aha",11111.1),
		};
		Arrays.sort(books);//������������
		System.out.println(Arrays.toString(books));
	}

}
