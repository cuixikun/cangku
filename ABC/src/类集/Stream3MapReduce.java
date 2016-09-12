package 类集;

import java.util.ArrayList;
import java.util.List;

class ShopCar{
	private String pname;
	private double price;
	private int amount;
	public ShopCar(String pname,double price,int amount){
		this.pname = pname;
		this.price = price;
		this.amount = amount;
	}
	public String getPname(){
		return pname;
	}
	public double getPrice(){
		return price;
	}
	public int getAmount(){
		return amount;
	}
}
public class Stream3MapReduce {
	public static void main(String args[]) throws Exception{
		List<ShopCar> all = new ArrayList<ShopCar>();
		all.add(new ShopCar("what",110.0,20));
		all.add(new ShopCar("the",100.0,200));
		all.add(new ShopCar("fack",90.0,2000));
		double s= all.stream().map((x)-> x.getAmount()*x.getPrice()).reduce((sum,m)->sum+m).get();
		System.out.println("花费总金额：" + s);
	}

}
