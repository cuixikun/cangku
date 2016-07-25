package 枚举;
interface Flower{
	public String getTitle();
}
enum Colorful implements Flower {
	RED("红色"),BLUE("蓝色"),GREEN("绿色");
	private String title;
	private Colorful(String title){
		this.title=title;
	}
	public String toString(){
		return this.title;
	}
	public String getTitle(){
		return this.title;
	}
}
public class Meiju3 {
	public static void main(String args[]){
		Flower flo=Colorful.RED;
		System.out.println(flo.getTitle());
		
		}
	}


