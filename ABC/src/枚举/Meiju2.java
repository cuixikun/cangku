package ö��;
enum Color {
	RED("��ɫ"),BLUE("��ɫ"),GREEN("��ɫ");
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
