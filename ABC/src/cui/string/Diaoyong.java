package cui.string;

class Book{
	String title;
	double price;
	public void getInfo(){
		System.out.println("图书名称:"+title+",价格"+price);
	}
}

public class Diaoyong {
	public static void main(String[] args){
		Book bk=new Book();//声明实例化对象
		bk.title="Java开发";
		bk.price=99.9;//操作属性内容
		bk.getInfo();//调用类中的getInfo()方法
	}

}
