package cui.string;

class Book{
	String title;
	double price;
	public void getInfo(){
		System.out.println("ͼ������:"+title+",�۸�"+price);
	}
}

public class Diaoyong2 {
	public static void main(String[] args){
		Book bookA=new Book();
		Book bookB=new Book();
		bookA.title="Java����";
		bookA.price=16.6;
		bookB.title="JSP����";
		bookB.price=99.9;
		bookB=bookA;
		bookB.price=10000.0;
		bookA.getInfo();
		
	}

}
