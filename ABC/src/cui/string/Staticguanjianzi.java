package cui.string;

class Drink{
	private String name;
	private double price;
	public Drink(String name,double price){
		this.name=name;
		this.price=price;
	}
	static String company="������";
	public String getInfo(){
		return "���ƣ�"+this.name+"���۸�"+this.price+"�����ң�"+this.company;
	}
}

public class Staticguanjianzi {
	public static void main(String args[]){
		Drink yina=new Drink("Ӫ������",3.0);
		Drink yinb=new Drink("Ӫ��������",4.0);
		Drink yinc=new Drink("Ӫ����������",5.0);
		Drink.company="�޹���";//==yina..company="�޹���"
		System.out.println(yina.getInfo());
		System.out.println(yinb.getInfo());
		System.out.println(yinc.getInfo());
	}

}
