package annotation;
class Book<T>{
	@SuppressWarnings("unused")
	private T title;
	public void setTitle(T title){
		this.title=title;
	}
	public T getTitle(){
		return title;
	}
}
public class Yazhijinggao {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]){
		Book book =new Book();
		book.setTitle("hello");
	}

}
