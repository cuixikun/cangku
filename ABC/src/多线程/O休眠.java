package ���߳�;
class MyThread implements Runnable{
	public void run(){
		for(int x=0;x<10000;x++){
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+",x="+x);
		}
	}
}
public class O���� {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"A").start();
	}
		

}
