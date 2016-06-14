package cui.string;

class Emp{
	private int empno;
	private String ename;
	private double sal;
	private String dept;
	public Emp(){
		this(0,"无名氏",9.0,"未知");
		
	}
	public Emp(int empno){
		this(empno,"临时工",300.0,"后勤");
	}
	public Emp(int empno,String ename){
		this(empno,ename,9000.0,"技术部");
	}
	public Emp(int empno,String ename,double sal,String dept){
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;
		this.dept=dept;
	}
	public String getInfo(){
		return "雇员编号："+this.empno+"，名字："+this.ename+"，工资："+this.sal+"，部门："+this.dept;
	}
}

public class Guanjianzi4 {
	public static void main(String args[]){
		Emp ea=new Emp();
		Emp eb=new Emp(7669);
		Emp ec=new Emp(6738,"Akjdk");
		Emp ed=new Emp(5679,"Smith",9999.0,"技术");
		System.out.println(ea.getInfo());
		System.out.println(eb.getInfo());
		System.out.println(ec.getInfo());
		System.out.println(ed.getInfo());


	}

}
