package ���߳�;
class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
public class O������ȡ�� {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"A").start();
		new Thread(mt).start();
		new Thread(mt).start();
		
	}

}
