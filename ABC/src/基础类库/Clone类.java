package �������;
class Bk implements Cloneable{
	private String title;
	private double price;
	public Bk(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "������"+this.title+"���۸�"+this.price;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();//���ø���Ŀ�¡����
	}
}
public class Clone�� {
	public static void main(String args[]) throws Exception{
		Bk bka = new Bk("java����",79.0);
		Bk bkb = (Bk) bka.clone();
		System.out.println(bka);
		System.out.println(bkb);
	}

}
