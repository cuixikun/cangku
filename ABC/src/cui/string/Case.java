package cui.string;

public class Case {
	public static void main(String[] args){
		String str="HELLO";
		switch(str) {
		case "hello":{
			System.out.println("������hello");
			break;
		}
		case "HELLO":{
			System.out.println("������HELLO");
			break;
		}
		case "what":{
			System.out.println("������what");
			break;
		}
		default:{
			System.out.println("û��ƥ������");
			break;
		}
		}
	}

}
