package 多线程;
class MyThread implements Runnable{
	public void run(){
		for(int x=0;x<20;x++){
			try{
			Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+",x="+x);
		}
	}
}
public class O优先级 {
	public static void main(String args[]) throws Exception{
		    MyThread mt=new MyThread();
            Thread t1=new Thread(mt,"A");
            Thread t2=new Thread(mt,"B");
            Thread t3=new Thread(mt,"C");
            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.NORM_PRIORITY);
            t1.start();
            t2.start();
            t3.start();
	}

}
