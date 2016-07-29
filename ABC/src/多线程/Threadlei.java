package 多线程;
//线程操作主类
class MyThread extends Thread{
	private String name;//定义类中属性
	public MyThread(String name){
		this.name=name;
	}
	public void run(){//覆写run()方法，作为线程的主体操作方法
		for(int x=0;x<200;x++){
			System.out.println(this.name+"-->"+x);
		}
	}
}
public class Threadlei {
	public static void main(String args[]){
		MyThread mt1=new MyThread("线程A");
		MyThread mt2=new MyThread("线程B");
		MyThread mt3=new MyThread("线程C");
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
