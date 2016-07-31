package ���߳�;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
class MyThread implements Callable<String>{
	private int ticket=10;
	public String call() throws Exception{
		for(int x=0;x<100;x++){
			if(this.ticket>0){
				System.out.println("��Ʊ��ticket="+this.ticket--);
			}
		}
		return "Ʊ������";
	}
}
public class O3 {
	public static void main(String args[]) throws InterruptedException, ExecutionException{
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		FutureTask<String> task1=new FutureTask<String>(mt1);
		FutureTask<String> task2=new FutureTask<String>(mt2);//Ŀ����ȡ��call()�ķ��ؽ��
		//FutureTask��Runnable�ӿ����࣬���Կ�����Thread��Ĺ���������task����
		new Thread(task1).start();
		new Thread(task2).start();
		//���߳�ִ����Ϻ����ȡ�����ݣ�����FutureTask�ĸ��ӿ�Future�е�get()����ȡ��
		System.out.println("A�̵߳ķ��ؽ����"+task1.get());
		System.out.println("B�̵߳ķ��ؽ����"+task2.get());
	}

}
