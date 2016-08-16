package 反射机制;

import java.lang.reflect.Constructor;

public class A反射构造 {
	public static void main(String args[]) throws Exception{
		Class<?> cls = Class.forName("反射机制2.A");
		Constructor<?> con = cls.getConstructor(String.class,double.class);
		Object obj = con.newInstance("java开发",10.0);//相当于使用new调用无参构造实例化
		System.out.println(obj);
	}

}
