package object;
class Sex{
	private String title;
	private static final Sex MALE=new Sex("��");
	private static final Sex FEMALE=new Sex("Ů");
	private Sex(String title){//���췽��˽�л�
		this.title=title;
	}
	public String toString(){
		return this.title;
	}
	public static Sex getInstance(int ch){
		switch(ch){
		case 1 : return MALE;
		case 2 : return FEMALE;
		default : return null;
		}
	}
}
public class Gouzaofangfasiyouhuaduolisheji {
	public static void main(String args[]){
		Sex sex = Sex.getInstance(2);
		System.out.print(sex);
	}

}
