package ö��;//����Ƕ���
class Color{
	private String title;
	private static final Color RED =new Color("��ɫ");
	private static final Color BLUE =new Color("��ɫ");
	private static final Color GREEN =new Color("��ɫ");
	private Color(String title){
		this.title=title;
	}
	public static Color getInstance(int ch){
		switch(ch){
		case 1:
			return RED;
		case 2:
			return BLUE;
		case 3:
			return GREEN;
			default:
				return null;
		}
		
	}
	public String toString(){
		return this.title;
	}
}
public class Meiju {
	public static void main(String args[]){
		Color red=Color.getInstance(1);
		System.out.println(red);
		
	}

}
