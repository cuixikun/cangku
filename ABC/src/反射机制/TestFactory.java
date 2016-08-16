package 反射机制;
interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	@Override
	public void eat(){
		System.out.println("******吃苹果*****");
	}
}
class Orange implements Fruit{
	@Override
	public void eat(){
		System.out.println("******吃橘子*****");
	}
}
class Factory{
	public static Fruit getInstance(String className){
		Fruit f = null;
		try{
		   f = (Fruit) Class.forName(className).newInstance();
		}catch (Exception e){}
		return f;
	}	
}
public class TestFactory {
	public static void main(String args[]){
		Fruit f = Factory.getInstance("反射机制.Orange");
		f.eat();
	}

}
