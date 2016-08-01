package 多线程;
class MyThread implements Runnable{
	private int ticket=5;
	public void run(){
		for(int x=0;x<20;x++){
			if(this.ticket>0){
			System.out.println(Thread.currentThread().getName()+"卖票，ticket"+this.ticket--);
			}
		}
	}
}
public class O同步 {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"票贩子A").start();
		new Thread(mt,"票贩子B").start();
		new Thread(mt,"票贩子C").start();
		new Thread(mt,"票贩子D").start();
	}

}
