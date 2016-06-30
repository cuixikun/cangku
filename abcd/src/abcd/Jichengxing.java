package abcd;

class Person{
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}
class Student extends Person{//继承person的父类
	private String school;
	public void setSchool(String school){
		this.school=school;
	}
	public String getSchool(){
		return this.school;
	}
}

public class Jichengxing {
	public static void main(String args[]){
	Student stu=new Student();
	stu.setName("欧阳展");
	stu.setAge(18);
	stu.setSchool("湖南文理学院");
	System.out.println("姓名："+stu.getName()+"，年龄："+stu.getAge()+"，学校："+ stu.getSchool());
	}
}