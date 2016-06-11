package cui.string;

public class Equals {
	public static void main(String args[]){
		String stra="hello";
		String strb=new String("hello");
		String strc=strb;//引用传递
		System.out.println(stra==strb);
		//==是关系运算符，主要功能是进行数值相等的判断，如果用在String表示内存地址数值的比较
		System.out.println(strb.equals(stra ));
		//equals专门负责字符串内容的比较
		System.out.println(strc.equals(strb));
		
	}

}
