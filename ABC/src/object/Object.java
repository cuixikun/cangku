package object;

class Book{
	private String title;
	private double price;
	public Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public boolean equals(Object obj){
		if(this == obj){//��ַ��ͬ
			return true;
		}
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Book)){//���Ǳ���ʵ��
			return false;
		}
		Book book=(Book) obj;
		if(this.title.equals(book.title)&&this.price==book.price){
			return true;
		}
		return false;
	}
	public String toString(){//����getInfo()
		return"������"+this.title+"���۸�"+this.price;
	}
}

public class Object {
	public static void main(String args[]){
		Book b1=new Book("��������",99.9);
		Book b2=new Book("��������",99.9);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals("hello"));
	}

}
