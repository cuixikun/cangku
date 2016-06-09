package cui.string;

class Book{
	private String title;
	private double price;
	public Book(String t,double p){
		title=t;
		price=p;
	}
	public String getInfo(){
		return"书名："+title+"，价格："+price;
	}
}


public class Duixiangshuzu {
	public static void main(String args[]){
		//开辟了一个3个长度的对象数组
		Book books[]=new Book[3];
		//对象数组中的每个数据都需要分别实例化
		books[0]=new Book("java",78.9);
		books[1]=new Book("java",78.9);
		books[2]=new Book("java",78.9);
		for(int x=0;x<books.length;x++){
			System.out.println(books[x].getInfo());
		}
	}

}
