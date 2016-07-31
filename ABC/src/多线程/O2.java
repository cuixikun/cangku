package 多线程;
class MyThread implements Runnable{
	private int ticket=10;
	public void run(){//覆写run()方法，作为线程的主体操作方法
		for(int x=0;x<100;x++){
			if(this.ticket>0){
				System.out.println("买票，ticket="+this.ticket--);
			}
		}
	}
}
public class O2 {
	public static void main(String args[]){
		//由于MyThread类有start()方法，所以MyThread类对象就是一个线程对象，可以直接启动
		MyThread mt=new MyThread();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}
