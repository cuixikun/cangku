package cui.string;

class Dept{
	private int deptno;
	private String dname;
	private String loc;
	private Abc abcs[];//多个员工
	public void setAbcs(Abc[] abcs){
		this.abcs=abcs;
	}
	public Abc[] getAbcs(){
		return this.abcs;
	}
	public Dept(int deptno,String dname,String loc){
		this.deptno=deptno;
		this.dname=dname;
		this.loc=loc;
	}
	public String getInfo(){
		return "部门编号："+this.deptno+"，名称："+this.dname+"，位置："+this.loc;
	}
}
class Abc{
	private int ano;
	private String aname;
	private String job;
	private double sal;
	private double comm;
	private Dept dept;//表示对应的部门信息
	private Abc lingdao;//员工对应的领导
	public void setLingdao(Abc lingdao){
		this.lingdao=lingdao;
	}
	public Abc getLingdao(){
		return this.lingdao;
	}
	public void setDept(Dept dept){
		this.dept=dept;
	}
	public Dept getDept(){
		return this.dept;
	}
	
	public Abc(int ano,String aname,String job,double sal,double comm){
		this.ano=ano;
		this.aname=aname;
		this.job=job;
		this.sal=sal;
		this.comm=comm;
	}
	public String getInfo(){
		return "员工编号："+this.ano+"，员工名字："+this.aname+"，职位："+this.job+"，工资："+this.sal+"，佣金："+this.comm;		
		
	}
}
public class Shili2 {
	public static void main(String args[]){
		//第一步设置数据
		//1产生各自的独立对象
		Dept dept=new Dept(100,"财务部","Tokyo");
		Abc abca=new Abc(1000,"苍井空","Tokyohot",2000.0,0.90);
		Abc abcb=new Abc(1100,"濑亚美莉","Tokyohot",3000.0,0.90);
		Abc abcc=new Abc(1200,"柚木提娜","Tokyohot",2500.0,0.90);
		//2设置雇员和领导关系
		abca.setLingdao(abcb);
		abcb.setLingdao(abcc);
		//3设置雇员与部门关系
		abca.setDept(dept);
		abcb.setDept(dept);
		abcc.setDept(dept);
		dept.setAbcs(new Abc[]{abca,abcb,abcc});
		//第二部取出数据
		//1通过雇员找到领导信息和部门信息
		System.out.println(abca.getInfo());
		System.out.println(abca.getLingdao().getInfo());
		System.out.println(abca.getDept().getInfo());
		//根据部门找到所有的雇员及雇员的领导信息
		System.out.println("---------------------------------");
		System.out.println(dept.getInfo());
		for(int x=0;x<dept.getAbcs().length;x++){
			System.out.println(dept.getAbcs()[x].getInfo());
			if(dept.getAbcs()[x].getLingdao()!=null){
			System.out.println("\t|-"+dept.getAbcs()[x].getLingdao().getInfo());
			}
		}
		
	}

}
