package cui.string;

class Drink1{
	private String name;
	private double price;
	private static String company="健力宝";
	public Drink1(String name,double price){
		this.name=name;
		this.price=price;
	}
	public static void setCompany(String p){
		company=p;
	}
	
	public String getInfo(){
		return "名称："+this.name+"，价格："+this.price+"，厂家："+this.company;
	}
}
//static不能直接访问非static属性和方法，非static方法可以直接访问static

public class Staticguanjianzi2 {
	public static void main(String args[]){
		//static定义的结构，不受实例化对象的控制，可以在没有实例化对象时访问，
		Drink1.setCompany("娃哈哈");
		Drink1 yina=new Drink1("营养快线",3.0);
		Drink1 yinb=new Drink1("营养超快线",4.0);
		Drink1 yinc=new Drink1("营养超级快线",5.0);
		System.out.println(yina.getInfo());
		System.out.println(yinb.getInfo());
		System.out.println(yinc.getInfo());
	}

}
