package 反射机制;
class Book{
	public Book(){
		System.out.println("-------------------Book类的无参构造方法-------------------------");
	}
	public String toString(){
		return "这是一本书";
		
	}
}
public class A反射实例化对象 {
	public static void main(String args[]) throws Exception{
		Class<?> cls = Class.forName("反射机制.Book");
		Object obj = cls.newInstance();//相当于使用new调用无参构造实例化
		Book book = (Book) obj;
		System.out.println(book);
	}

}
