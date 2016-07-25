package 枚举;
enum Color {
	RED("红色"),BLUE("蓝色"),GREEN("绿色");
	private String title;
	private Color(String title){
		this.title=title;
	}
	public String toString(){
		return this.title;
	}
}
public class Meiju2 {
	public static void main(String args[]){
		for(Color c:Color.values()){
			System.out.println(c);
		
		}
	}
}
