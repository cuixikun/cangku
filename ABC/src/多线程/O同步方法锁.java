package 多线程;
class MyThread implements Runnable{
	private int ticket=188;
	@Override
	public void run(){
		for(int x=0;x<200;x++){
			this.sale();//调用同步方法
		}
	}

	public synchronized void sale(){//同步方法
		if(this.ticket>0){
			try{
				Thread.sleep(100);
				}catch(InterruptedException e){
				       e.printStackTrace();
				}
		System.out.println(Thread.currentThread().getName()+"卖票，ticket"+this.ticket--);
	}
}
}
public  class O同步方法锁 {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"票贩子A").start();
		new Thread(mt,"票贩子B").start();
		new Thread(mt,"票贩子C").start();
		new Thread(mt,"票贩子D").start();
	}
}
