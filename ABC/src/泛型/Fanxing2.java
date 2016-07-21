package 泛型;
//此时设置的T在point类定义上只表示一个标记，在使用时要为其设置具体的类型
class Point<T>{
	private T x;//此属性的类型不知道，由point类使用时动态决定
	private T y;
	public void setX(T x){
		this.x=x;
	}
	public void setY(T y){
		this.y=y;
	}
	public T getX(){
		return x;
	}
	public T getY(){
		return y;
	}
}
public class Fanxing2 {
	public static void main(String args[]){
		Point<String> p=new Point<String>();
		p.setX("东经30度");
		p.setY("北纬10度");
		String x= p.getX();
		String y= p.getY();
		System.out.println("x的坐标："+x+" y的坐标："+y);
	}

}
