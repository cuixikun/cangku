package java������1;
/**
 * ʵ�ַ��������ýӿ�
 * @param <P>���÷����Ĳ�������
 * @param <R>���÷����ķ�������
 */
//������::static��������
interface E<P,R>{
	public R zhuanhuan(P p);
}
public class Fangfayinyong {
	public static void main(String args[]){
		//��String��valueOf������Ϊ��E�ӿ����zhuanhuan()����
		E<Integer,String> e=String::valueOf;
		String str=e.zhuanhuan(1000);
		System.out.println(str.replaceAll("0","9"));
	}

}
