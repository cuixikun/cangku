package cui.string;

class Book{
	private String title;
	private double price;
	public Book (String t,double p){
		title=t;
		setPrice(p);
	}
	public void setTitle(String t){
		title=t;
	}
	public void setPrice(Double p){
		if(p>0.0){
		price=p;
		}
	}
	public String getTitle(){
		return title;
	}
	public Double getPrice(){
		return price;
	}
	public void getInfo(){
		System.out.println("图书名称:"+title+",价格"+price);
	}
}



public class Gouzaofangfa {
	public static void main(String[] args){
		Book bk=new Book("Java开发",99.9);//声明实例化对象
		bk.getInfo();
	}

}
