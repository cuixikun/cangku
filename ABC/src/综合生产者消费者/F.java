package 综合生产者消费者;
class Info{
	private String title;
	private String content;
	public synchronized void set(String title,String content){
		this.title=title;
		try{
			Thread.sleep(200);
			}catch(InterruptedException e){
			       e.printStackTrace();
			}
		this.content=content;
	}
	public synchronized void get(){
		try{
			Thread.sleep(100);
			}catch(InterruptedException e){
			       e.printStackTrace();
			}
		System.out.println(this.title+"-"+this.content);
	}
	}
class Productor implements Runnable{
	private Info info;
	public Productor(Info info){
		this.info=info;
	}
	public void run(){
		for(int x=0;x<100;x++){
			if(x%2==0){
				this.info.set("欧阳锋","高手");
			}else{
				this.info.set("草泥马","禽兽不如");
			}
		}
	}
}
class Customer implements Runnable{
	private Info info;
	public Customer(Info info){
		this.info=info;
	}
	public void run(){
		for(int x=0;x<100;x++){
			this.info.get();
		  
		}
	}
}
public class F {
	public static void main(String args[]) throws Exception{
		Info info=new Info();
		new Thread(new Productor(info)).start();
		new Thread(new Customer(info)).start();
	}

}
