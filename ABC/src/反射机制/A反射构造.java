package �������;

import java.lang.reflect.Constructor;

public class A���乹�� {
	public static void main(String args[]) throws Exception{
		Class<?> cls = Class.forName("�������2.A");
		Constructor<?> con = cls.getConstructor(String.class,double.class);
		Object obj = con.newInstance("java����",10.0);//�൱��ʹ��new�����޲ι���ʵ����
		System.out.println(obj);
	}

}
