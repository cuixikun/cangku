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
class Student extends Person{//�̳�person�ĸ���
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
	stu.setName("ŷ��չ");
	stu.setAge(18);
	stu.setSchool("��������ѧԺ");
	System.out.println("������"+stu.getName()+"�����䣺"+stu.getAge()+"��ѧУ��"+ stu.getSchool());
	}
}