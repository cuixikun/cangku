package java������1;
/**
 * ʵ�ַ��������ýӿ�
 * @param <P>���÷����Ĳ�������
 * @param <R>���÷����ķ�������
 */
//ʵ��������::��ͨ����
interface F<R>{
	public R upper();
}
public class Fangfayinyong2 {
	public static void main(String args[]){
		//String���toUpperCase()���壺public String toUpperCase()
		//�������û�в����������з���ֵ�������������һ��Ҫ����ʵ�������������²ſ��Ե���
		//"hello"�ַ�����String���ʵ�����������Կ���ֱ�ӵ���toUpperCase()����
		//��toUpperCase()������Ӧ�ý�����F�ӿ�
		F<String> f="hello"::toUpperCase;
		String str=f.upper();//�൱��hello��toUpperCase()
		System.out.println(str);
	}

}
