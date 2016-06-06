package cui.string;

class Emp{
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	public Emp(){}
	public Emp(int eno, String ena,String j,double s,double c){
		empno=eno;
		ename=ena;
		job=j;
		sal=s;
		comm=c;
	}
	public void setEmpno(int e){
		empno=e;
	}
	public void setEname(String e){
		ename=e;
	}
	public void setJob(String j){
		job=j;
	}
	public void setSal(double s){
		sal=s;
	}
	public void setComm(double c){
		comm=c;
	}
	public int getEmpno(){
		return empno;
	}
	public String getEname(){
		return ename;
	}
	public String getJob(){
		return job;
	}
	public double getSal(){
		return sal;
	}
	public double getComm(){
		return comm;
	}
	public String getInfo(){
		return  "��Ա��ţ�"+empno+"\n"+
	            "��Ա����:"+ename+"\n"+
				"��Աְλ:"+job+"\n"+
	            "��������:"+sal+"\n"+
				"Ӷ         ��:"+comm+"\n";
	}
}

public class Jiandan {
	public static void main(String[] args){
		Emp e=new Emp(123654,"JOHN","player",300.0,1.0);
		System.out.println(e.getInfo());
		
	}

}
