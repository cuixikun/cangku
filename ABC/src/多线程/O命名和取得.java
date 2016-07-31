package 多线程;
class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
public class O命名和取得 {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"A").start();
		new Thread(mt).start();
		new Thread(mt).start();
		
	}

}
