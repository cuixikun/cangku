package cui.string;

class Member{
	private int mid;
	private String name;
	private Member child;
	//car��ʵ���������ʾ�г�
	//carΪnull��ʾû�� 
	private Car car;//��ʾ�����˵ĳ�
	public Member(int mid,String name){
		this.mid=mid;
		this.name=name;
	}
	public String getInfo(){
		return "��Ա��ţ�"+this.mid+"��������"+this.name;
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
	private Member member;//��������
	private String pname;
	public Car(String pname){
		this.pname=pname;
	}
	public String getInfo(){
		return "�������֣�"+this.pname;
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
		Member m=new Member(123,"Smith");//��������
		Member chd=new Member(321,"secondsmith");//һ������
		Car c=new Car("����x5");//��������
		Car cc=new Car("������");
		m.setCar(c);//һ������һ����
		c.setMember(m);//һ��������һ����
		chd.setCar(cc);//һ��������һ����
		cc.setMember(chd);//һ��������һ������
		m.setChild(chd);//һ������һ������
		//ͨ�����ҵ���
		System.out.println(m.getCar().getInfo());
		//ͨ�����ҵ���
		System.out.println(c.getMember().getInfo());
		//ͨ�����ҵ�������
		System.out.println(m.getChild().getInfo());
		//ͨ�����ҵ������ӳ�����Ϣ
		System.out.println(m.getChild().getCar().getInfo());
	}

}
