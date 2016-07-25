package 枚举;
enum Colorfully{
	RED,GREEN,BLUE;
}
public class Meijuyingyong {
	public static void main(String args[]){
		Colorfully c=Colorfully.RED;
		switch(c){
		case RED:
			System.out.println("这是红色");
			break;
		case GREEN:
			System.out.println("这是绿色");
			break;
		case BLUE:
			System.out.println("这是蓝色");
			break;
		}
	}

}
