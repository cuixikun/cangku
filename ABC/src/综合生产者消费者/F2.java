package �ۺ�������������;
class Info{
	private String title;
	private String content;
	public boolean flag=true;//��ʾ����������������ȡ��
	              //flag=false,��ʾ����ȡ�ߣ�����������
	public synchronized void set(String title,String content){
		if(flag==false){
			try{
				super.wait();;
				}catch(InterruptedException e){
				       e.printStackTrace();
				}
		}
		this.title=title;
		try{
			Thread.sleep(200);
			}catch(InterruptedException e){
			       e.printStackTrace();
			}
		this.content=content;
		this.flag=false;//�޸��������
		super.notify();//���������ȴ��߳�
	}
	public synchronized void get(){
		if(flag==true){
			try{
				super.wait();;
				}catch(InterruptedException e){
				       e.printStackTrace();
				}
		}
		try{
			Thread.sleep(100);
			}catch(InterruptedException e){
			       e.printStackTrace();
			}
		System.out.println(this.title+"-"+this.content);
		this.flag=true;
		super.notify();
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
				this.info.set("ŷ����","����");
			}else{
				this.info.set("������","���޲���");
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
public class F2 {
	public static void main(String args[]) throws Exception{
		Info info=new Info();
		new Thread(new Productor(info)).start();
		new Thread(new Customer(info)).start();
	}

}
