package cui.string;



class Bok3{
	private String title;
	private double price;
	public Bok3(String title,double price){
		this.title=title;
		this.price=price;
	}
	public boolean equals(Object obj){
		if(this == obj){//��ַ��ͬ
			return true;
		}
		if(obj==null){
			return false;
		}
		if(!(obj instanceof Bok3)){//���Ǳ���ʵ��
			return false;
		}
		Bok3 book=(Bok3) obj;
		if(this.title.equals(book.title)&&this.price==book.price){
			return true;
		}
		return false;
	}
	public String toString(){//����getInfo()
		return"������"+this.title+"���۸�"+this.price;
	}
}

public class Bijiaoequals {
	public static void main(String args[]){
		Bok3 b1=new Bok3("��������",99.9);
		Bok3 b2=new Bok3("��������",99.9);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals("hello"));
	}

}
