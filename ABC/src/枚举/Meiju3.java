package ö��;
interface Flower{
	public String getTitle();
}
enum Colorful implements Flower {
	RED("��ɫ"),BLUE("��ɫ"),GREEN("��ɫ");
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


