package �������;

public class StrBuffer {
	public static void main(String args[]) throws Exception{
		//String�����ֱ�Ӹ�ֵʵ������StringBuffer�಻��
		StringBuffer sb=new StringBuffer();
		sb.append("hello").append("world").append("!!!");
		change(sb);//���ô���
		System.out.println(sb);
	}
    public static void change(StringBuffer temp){
    	temp.append("\n").append("hello earth");
    }
}
