package annotation;
class Book{
	@Deprecated
	public void fun(){}
}
public class Guoqishengming {
	public static void main(String args[]){
		Book book=new Book();
		book.fun();
	}

}
