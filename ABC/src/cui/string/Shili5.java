package cui.string;

class Admin{
	private String aid;
	private String password;
	private Role role;
	public Admin(String aid,String password){
		this.aid=aid;
		this.password=password;
	}
	public void setRole(Role role){
		this.role=role;
	}
	public Role getRole(){
		return this.role;
	}
	public String getInfo(){
		return "����Ա��ţ�"+this.aid+"�����룺"+this.password;
	}
	
}
class Role{
	private int rid;
	private String title;
	private Admin admins[];
	private Group groups[];
	public Role(int rid,String title){
		this.rid=rid;
		this.title=title;
	}
	public void setAdmins(Admin [] admins){
		this.admins=admins;
	}
	public void setGroups(Group [] groups){
		this.groups=groups;
	}
	public Group[] getgroups(){
		return this.groups;
	}
	public Admin[] getadmins(){
		return this.admins;
	}
	public String getInfo(){
		return "��ɫ��ţ�"+this.rid+"�����ƣ�"+this.title;
	}
}
class Group{
	private int gid;
	private String title;
	private Role roles[];
	private Action actions[];
	public Group(int gid,String title){
		this.gid=gid;
		this.title=title;
	}
	public void setRoles(Role[] roles){
		this.roles=roles;
	}
	public void setActions(Action[] actions){
		this.actions=actions;
	}
	public Action[] getactions(){
		return this.actions;
	}
	public Role [] getroles(){
		return this.roles;
	}
	public String getInfo(){
		return "Ȩ�����ţ�"+this.gid+"�����ƣ�"+this.title;
	}
	
}
//Ȩ��
class Action{
	private int aid;
	private String title;
	private String url;
	private Group[] group;
	public Action(int aid,String title,String url){
		this.aid=aid;
		this.title=title;
		this.url=url;
	}
	public void setGroup(Group[] group){
		this.group=group;
	}
	public Group[] getGroup(){
		return this.group;
	}
	public String getInfo(){
		return "Ȩ�ޱ�ţ�"+this.aid+",���ƣ�"+this.title+"��·����"+this.url;
	}
	
}
public class Shili5 {
	public static void main(String args[]){
		Admin a1=new Admin("admin","hello1");
		Admin a2=new Admin("bdmin","hello2");
		Admin a3=new Admin("cdmin","hello3");
		Role r1=new Role(1,"ϵͳ����Ա");
		Role r2=new Role(2,"��Ϣ����Ա");
		Group g1=new Group(10,"��Ϣ����");
		Group g2=new Group(11,"�û�����");
		Group g3=new Group(12,"���ݹ���");
		Group g4=new Group(13,"�ӿڹ���");
		Group g5=new Group(14,"���ݹ���");
		Action ac1=new Action(1001,"���ŷ���","---");
		Action ac2=new Action(1001,"�����б�","---");
		Action ac3=new Action(1001,"�������","---");
		Action ac4=new Action(1001,"�����û�","---");
		Action ac5=new Action(1001,"�û��б�","---");
		//��ɫ�����Ա
		a1.setRole(r1);
		a2.setRole(r2);
		a3.setRole(r2);
		r1.setAdmins(new Admin[] {a1});
		r2.setAdmins(new Admin[] {a2,a3});
		//��ɫ�������
		r1.setGroups(new Group[]{g1,g2,g3,g4,g5});
		r2.setGroups(new Group[]{g1,g2});
		g1.setRoles(new Role[] {r1,r2});
		g2.setRoles(new Role[] {r1,r2});
		g3.setRoles(new Role[] {r1});
		g4.setRoles(new Role[] {r1});
		g5.setRoles(new Role[] {r1});
		//����Ա����Ȩ��
		g1.setActions(new Action[]{ac1,ac2});
		g2.setActions(new Action[]{ac1});
		g3.setActions(new Action[]{ac2});
		g4.setActions(new Action[]{ac3});
		g5.setActions(new Action[]{ac4,ac5});
		ac1.setGroup(new Group[]{g1,g2});
		ac2.setGroup(new Group[]{g1,g3});
		ac3.setGroup(new Group[]{g4});
		ac4.setGroup(new Group[]{g5});
		ac5.setGroup(new Group[]{g5});
		System.out.println(a1.getInfo());
		System.out.println("\t"+a1.getRole().getInfo());
		for (int x=0;x<( a1.getRole()).getGroups().length;x++){
			System.out.println("\t\t"+a1.getRole().getGroups().getInfo());
			for(int y=0;y<a1.getRole().getGroups()[x].getAction().length;y++){
				System.out.println("\t\t\t"+a1.getRole().getGroups()[x].getAction()[y].getInfo9);
			}
		}
		System.out.println("***********************************************");
		System.out.println(g2.getInfo());
		for(int x=0;x<g2.getRoles().lengtht;x++){
			System.out.println(g2.getRoles()[x].getInfo());
		}
	}

}
