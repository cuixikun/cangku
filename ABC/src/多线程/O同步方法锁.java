package ���߳�;
class MyThread implements Runnable{
	private int ticket=188;
	@Override
	public void run(){
		for(int x=0;x<200;x++){
			this.sale();//����ͬ������
		}
	}

	public synchronized void sale(){//ͬ������
		if(this.ticket>0){
			try{
				Thread.sleep(100);
				}catch(InterruptedException e){
				       e.printStackTrace();
				}
		System.out.println(Thread.currentThread().getName()+"��Ʊ��ticket"+this.ticket--);
	}
}
}
public  class Oͬ�������� {
	public static void main(String args[]) throws Exception{
		MyThread mt=new MyThread();
		new Thread(mt,"Ʊ����A").start();
		new Thread(mt,"Ʊ����B").start();
		new Thread(mt,"Ʊ����C").start();
		new Thread(mt,"Ʊ����D").start();
	}
}
