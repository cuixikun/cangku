package 泛型;
class Point{//定义坐标
	private Object x;
	private Object y;
	public void setX(Object x){
		this.x=x;
	}
	public void setY(Object y){
		this.y=y;
	}
	public Object getX(){
		return x;
	}
	public Object getY(){
		return y;
	}
}
public class Fanxing {
	public static void main(String args[]){
		Point p=new Point();
		p.setX(10);
		p.setY(20);
		int x=(Integer) p.getX();
		int y=(Integer) p.getY();
		System.out.println("x的坐标："+x+" y的坐标："+y);
	}

}
