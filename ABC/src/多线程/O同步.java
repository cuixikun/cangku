package ���߳�;
class MyThread implements Runnable{
	private int ticket=5;
	public void run(){
		for(int x=0;x<20;x++){
			if(this.ticket>0){
			System.out.println(Thread.currentThread().getName()+"��Ʊ��ticket"+this.ticket--);
			}
		}
	}
}
public class Oͬ�� {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"Ʊ����A").start();
		new Thread(mt,"Ʊ����B").start();
		new Thread(mt,"Ʊ����C").start();
		new Thread(mt,"Ʊ����D").start();
	}

}
