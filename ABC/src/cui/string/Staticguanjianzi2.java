package cui.string;

class Drink1{
	private String name;
	private double price;
	private static String company="������";
	public Drink1(String name,double price){
		this.name=name;
		this.price=price;
	}
	public static void setCompany(String p){
		company=p;
	}
	
	public String getInfo(){
		return "���ƣ�"+this.name+"���۸�"+this.price+"�����ң�"+this.company;
	}
}
//static����ֱ�ӷ��ʷ�static���Ժͷ�������static��������ֱ�ӷ���static

public class Staticguanjianzi2 {
	public static void main(String args[]){
		//static����Ľṹ������ʵ��������Ŀ��ƣ�������û��ʵ��������ʱ���ʣ�
		Drink1.setCompany("�޹���");
		Drink1 yina=new Drink1("Ӫ������",3.0);
		Drink1 yinb=new Drink1("Ӫ��������",4.0);
		Drink1 yinc=new Drink1("Ӫ����������",5.0);
		System.out.println(yina.getInfo());
		System.out.println(yinb.getInfo());
		System.out.println(yinc.getInfo());
	}

}
