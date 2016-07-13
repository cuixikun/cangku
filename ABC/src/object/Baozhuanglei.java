package object;

class MyInt{//一个类
	private int num;//这个类包装的基本数据类型
	//构造的目的是为了将基本数据类型传递给对象
	public MyInt(int num){//将基本类型包装
		this.num=num;
	}
	public int intValue(){//将包装的数据内容返回
		return this.num;
	}
}

public class Baozhuanglei {
	public static void main(String args[]){
		MyInt mi=new MyInt(10);//将int包装为类
		int temp=mi.intValue();//将对象中包装的数据取出
		//只有取出包装数据才可以计算
		System.out.println(temp*2);
	}

}
