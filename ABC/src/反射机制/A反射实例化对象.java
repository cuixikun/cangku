package �������;
class Book{
	public Book(){
		System.out.println("-------------------Book����޲ι��췽��-------------------------");
	}
	public String toString(){
		return "����һ����";
		
	}
}
public class A����ʵ�������� {
	public static void main(String args[]) throws Exception{
		Class<?> cls = Class.forName("�������.Book");
		Object obj = cls.newInstance();//�൱��ʹ��new�����޲ι���ʵ����
		Book book = (Book) obj;
		System.out.println(book);
	}

}
