package ����;
//��ʱ���õ�T��point�ඨ����ֻ��ʾһ����ǣ���ʹ��ʱҪΪ�����þ��������
class Point<T>{
	private T x;//�����Ե����Ͳ�֪������point��ʹ��ʱ��̬����
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
		p.setX("����30��");
		p.setY("��γ10��");
		String x= p.getX();
		String y= p.getY();
		System.out.println("x�����꣺"+x+" y�����꣺"+y);
	}

}
