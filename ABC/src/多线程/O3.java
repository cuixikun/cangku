package 多线程;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
class MyThread implements Callable<String>{
	private int ticket=10;
	public String call() throws Exception{
		for(int x=0;x<100;x++){
			if(this.ticket>0){
				System.out.println("买票，ticket="+this.ticket--);
			}
		}
		return "票已卖光";
	}
}
public class O3 {
	public static void main(String args[]) throws InterruptedException, ExecutionException{
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		FutureTask<String> task1=new FutureTask<String>(mt1);
		FutureTask<String> task2=new FutureTask<String>(mt2);//目的是取回call()的返回结果
		//FutureTask是Runnable接口子类，所以可以用Thread类的构造来接收task对象
		new Thread(task1).start();
		new Thread(task2).start();
		//多线程执行完毕后可以取得内容，依靠FutureTask的父接口Future中的get()方法取得
		System.out.println("A线程的返回结果："+task1.get());
		System.out.println("B线程的返回结果："+task2.get());
	}

}
