package 基础类库;

public class F插入 {
	public static void main(String args[]) throws Exception{
		StringBuffer sb=new StringBuffer("hello");
		sb.insert(0,"你好").insert(0,"&*^");
		System.out.println(sb);
	}

}
