package 异常处理;

public class Try {
	public static void main(String args[]){
		System.out.println("hello");
		try{
		System.out.println("hello"+(10/0));
		}catch(ArithmeticException e){
			System.out.println("出现异常");
		}
		System.out.println("hello");
	}

}
