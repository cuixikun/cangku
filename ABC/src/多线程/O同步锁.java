package 多线程;
class MyThread implements Runnable{
	private int ticket=5;
	public void run(){
		for(int x=0;x<20;x++){
			synchronized(this){//当前操作每次只允许一个对象进入
			if(this.ticket>0){
				try{
					Thread.sleep(1000);
					}catch(InterruptedException e){
					       e.printStackTrace();
					}
			System.out.println(Thread.currentThread().getName()+"卖票，ticket"+this.ticket--);
			}
		}
		}
	}
}
public class O同步锁 {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"票贩子A").start();
		new Thread(mt,"票贩子B").start();
		new Thread(mt,"票贩子C").start();
		new Thread(mt,"票贩子D").start();
	}

}
