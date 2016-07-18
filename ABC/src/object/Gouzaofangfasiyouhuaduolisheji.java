package object;
class Sex{
	private String title;
	private static final Sex MALE=new Sex("男");
	private static final Sex FEMALE=new Sex("女");
	private Sex(String title){//构造方法私有化
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
