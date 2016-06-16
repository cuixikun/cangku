package cui.string;

class Member{
	private int mid;
	private String name;
	private Member child;
	//car有实例化对象表示有车
	//car为null表示没车 
	private Car car;//表示属于人的车
	public Member(int mid,String name){
		this.mid=mid;
		this.name=name;
	}
	public String getInfo(){
		return "人员编号："+this.mid+"，姓名："+this.name;
	}
	public void setChild(Member child){
		this.child=child;
	}
	public Member getChild(){
		return this.child;
	}
	public void setCar(Car car){
		this.car=car;
	}
	public Car getCar(){
		return this.car;
	}
}
class Car{
	private Member member;//车属于人
	private String pname;
	public Car(String pname){
		this.pname=pname;
	}
	public String getInfo(){
		return "车的名字："+this.pname;
	}
	public void setMember(Member member){
		this.member=member;
	}
	public Member getMember(){
		return this.member;
	}
}

public class Shili {
	public static void main(String args[]){
		Member m=new Member(123,"Smith");//独立对象
		Member chd=new Member(321,"secondsmith");//一个孩子
		Car c=new Car("宝马x5");//独立对象
		Car cc=new Car("拖拉机");
		m.setCar(c);//一个人有一辆车
		c.setMember(m);//一辆车属于一个人
		chd.setCar(cc);//一个孩子有一辆车
		cc.setMember(chd);//一辆车属于一个孩子
		m.setChild(chd);//一个人有一个孩子
		//通过人找到车
		System.out.println(m.getCar().getInfo());
		//通过车找到人
		System.out.println(c.getMember().getInfo());
		//通过人找到他孩子
		System.out.println(m.getChild().getInfo());
		//通过人找到他孩子车的信息
		System.out.println(m.getChild().getCar().getInfo());
	}

}
