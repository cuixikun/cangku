package cui.string;

class Dept{
	private int deptno;
	private String dname;
	private String loc;
	private Abc abcs[];//���Ա��
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
		return "���ű�ţ�"+this.deptno+"�����ƣ�"+this.dname+"��λ�ã�"+this.loc;
	}
}
class Abc{
	private int ano;
	private String aname;
	private String job;
	private double sal;
	private double comm;
	private Dept dept;//��ʾ��Ӧ�Ĳ�����Ϣ
	private Abc lingdao;//Ա����Ӧ���쵼
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
		return "Ա����ţ�"+this.ano+"��Ա�����֣�"+this.aname+"��ְλ��"+this.job+"�����ʣ�"+this.sal+"��Ӷ��"+this.comm;		
		
	}
}
public class Shili2 {
	public static void main(String args[]){
		//��һ����������
		//1�������ԵĶ�������
		Dept dept=new Dept(100,"����","Tokyo");
		Abc abca=new Abc(1000,"�Ծ���","Tokyohot",2000.0,0.90);
		Abc abcb=new Abc(1100,"��������","Tokyohot",3000.0,0.90);
		Abc abcc=new Abc(1200,"��ľ����","Tokyohot",2500.0,0.90);
		//2���ù�Ա���쵼��ϵ
		abca.setLingdao(abcb);
		abcb.setLingdao(abcc);
		//3���ù�Ա�벿�Ź�ϵ
		abca.setDept(dept);
		abcb.setDept(dept);
		abcc.setDept(dept);
		dept.setAbcs(new Abc[]{abca,abcb,abcc});
		//�ڶ���ȡ������
		//1ͨ����Ա�ҵ��쵼��Ϣ�Ͳ�����Ϣ
		System.out.println(abca.getInfo());
		System.out.println(abca.getLingdao().getInfo());
		System.out.println(abca.getDept().getInfo());
		//���ݲ����ҵ����еĹ�Ա����Ա���쵼��Ϣ
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
