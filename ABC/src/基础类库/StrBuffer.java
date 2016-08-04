package 基础类库;

public class StrBuffer {
	public static void main(String args[]) throws Exception{
		//String类可以直接赋值实例化，StringBuffer类不行
		StringBuffer sb=new StringBuffer();
		sb.append("hello").append("world").append("!!!");
		change(sb);//引用传递
		System.out.println(sb);
	}
    public static void change(StringBuffer temp){
    	temp.append("\n").append("hello earth");
    }
}
