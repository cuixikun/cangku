package cui.string;

public class Case {
	public static void main(String[] args){
		String str="HELLO";
		switch(str) {
		case "hello":{
			System.out.println("内容是hello");
			break;
		}
		case "HELLO":{
			System.out.println("内容是HELLO");
			break;
		}
		case "what":{
			System.out.println("内容是what");
			break;
		}
		default:{
			System.out.println("没有匹配内容");
			break;
		}
		}
	}

}
