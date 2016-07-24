package Ã¶¾Ù;
enum Color {
	RED,BLUE,GREEN;
}
public class Meiju2 {
	public static void main(String args[]){
		for(Color c : Color.values()){
			System.out.println(c.ordinal()+"-"+c.name());
		}
		
	}
}
