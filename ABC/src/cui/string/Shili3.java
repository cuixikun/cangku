package cui.string;

class Province{
	private int pid;
	private String name;
	private City cities[];
	public Province(int pid,String name){
		this.pid=pid;
		this.name=name;
	}
	public void setCities(City cities[]){
		this.cities=cities;
	}
	public City[] getCities(){
		return this.cities;
	}
	public String getInfo(){
		return "省份编号："+this.pid+"，名称："+this.name;
	}
}
class City{
	private int cid;
	private String name;
	private Province province;
	public City(int cid,String name){
		this.cid=cid;
		this.name=name;
	}
	public void setProvince(Province province){
		this.province=province;
	}
	public Province getProvince(){
		return this.province;
	}
	public String getInfo(){
		return "城市编号："+this.cid+"，名称："+this.name;
	}
	
}
public class Shili3 {
	public static void main(String args[]){
		Province pro=new Province(1,"广东省");
		City c1=new City(1,"广州市");
		City c2=new City(1,"深圳市");
		City c3=new City(1,"佛山市");
		c1.setProvince(pro);
		c2.setProvince(pro);
		c3.setProvince(pro);
		pro.setCities(new City[]{c1,c2,c3});
		System.out.println(c2.getProvince().getInfo());
		for(int x=0;x<pro.getCities().length;x++){
			System.out.println("\t"+pro.getCities()[x].getInfo());
		}
				
		
	}

}
