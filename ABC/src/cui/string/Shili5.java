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
		return "管理员编号："+this.aid+"，密码："+this.password;
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
		return "角色编号："+this.rid+"，名称："+this.title;
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
		return "权限组编号："+this.gid+"，名称："+this.title;
	}
	
}
//权限
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
		return "权限编号："+this.aid+",名称："+this.title+"，路径："+this.url;
	}
	
}
public class Shili5 {
	public static void main(String args[]){
		Admin a1=new Admin("admin","hello1");
		Admin a2=new Admin("bdmin","hello2");
		Admin a3=new Admin("cdmin","hello3");
		Role r1=new Role(1,"系统管理员");
		Role r2=new Role(2,"信息管理员");
		Group g1=new Group(10,"信息管理");
		Group g2=new Group(11,"用户管理");
		Group g3=new Group(12,"数据管理");
		Group g4=new Group(13,"接口管理");
		Group g5=new Group(14,"备份管理");
		Action ac1=new Action(1001,"新闻发布","---");
		Action ac2=new Action(1001,"新闻列表","---");
		Action ac3=new Action(1001,"新闻审核","---");
		Action ac4=new Action(1001,"增加用户","---");
		Action ac5=new Action(1001,"用户列表","---");
		//角色与管理员
		a1.setRole(r1);
		a2.setRole(r2);
		a3.setRole(r2);
		r1.setAdmins(new Admin[] {a1});
		r2.setAdmins(new Admin[] {a2,a3});
		//角色与管理组
		r1.setGroups(new Group[]{g1,g2,g3,g4,g5});
		r2.setGroups(new Group[]{g1,g2});
		g1.setRoles(new Role[] {r1,r2});
		g2.setRoles(new Role[] {r1,r2});
		g3.setRoles(new Role[] {r1});
		g4.setRoles(new Role[] {r1});
		g5.setRoles(new Role[] {r1});
		//管理员组与权限
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
