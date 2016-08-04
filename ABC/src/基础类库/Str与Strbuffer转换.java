package 基础类库;

public class Str与Strbuffer转换 {
	public static void main(String args[]) throws Exception{
		StringBuffer sb=new StringBuffer("hello");//String变为StringBuffer
		System.out.println(sb);
	}

}
//StringBuffer sb=new StringBuffer();
//sb.append("hello");
//**************************************************
//*********************************************
//*****************************************
//StringBuffer变为String
public class Str与Strbuffer转换 {
	public static void main(String args[]) throws Exception{
		StringBuffer sb=new StringBuffer("hello");
		String str=sb.toString();//StringBuffer变为String
		System.out.println(str);
	}

}