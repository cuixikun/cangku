package cui.string;

class Drink{
	private String name;
	private double price;
	public Drink(String name,double price){
		this.name=name;
		this.price=price;
	}
	static String company="健力宝";
	public String getInfo(){
		return "名称："+this.name+"，价格："+this.price+"，厂家："+this.company;
	}
}

public class Staticguanjianzi {
	public static void main(String args[]){
		Drink yina=new Drink("营养快线",3.0);
		Drink yinb=new Drink("营养超快线",4.0);
		Drink yinc=new Drink("营养超级快线",5.0);
		Drink.company="娃哈哈";//==yina..company="娃哈哈"
		System.out.println(yina.getInfo());
		System.out.println(yinb.getInfo());
		System.out.println(yinc.getInfo());
	}

}
