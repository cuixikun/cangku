package cui.string;

class Outer{//�ⲿ��
	private String demo="hello world";//private static String demo
	class Inner{//����һ���ڲ���                                      //static class Inner
		public void print(){
			//�ⲿ�ࡣthis=�ⲿ��ĵ�ǰ����
			System.out.println(Outer.this.demo);
		}
		
	}
}

public class Waibulei {
	public static void main(String args[]){
		Outer.Inner in=new Outer().new Inner();//new Outer.Inner()
		in.print();
	}

}
