package cui.string;

class Book{
	String title;
	double price;
	public void getInfo(){
		System.out.println("图书名称:"+title+",价格"+price);
	}
}

public class Diaoyong2 {
	public static void main(String[] args){
		Book bookA=new Book();
		Book bookB=new Book();
		bookA.title="Java开发";
		bookA.price=16.6;
		bookB.title="JSP开发";
		bookB.price=99.9;
		bookB=bookA;
		bookB.price=10000.0;
		bookA.getInfo();
		
	}

}
