package ���߳�;
class MyThread implements Runnable{
	private String name;//������������
	public MyThread(String name){
		this.name=name;
	}
	public void run(){//��дrun()��������Ϊ�̵߳������������
		for(int x=0;x<200;x++){
			System.out.println(this.name+"-->"+x);
		}
	}
}
public class Runnablejiekkou {
	public static void main(String args[]){
		MyThread mt1=new MyThread("�߳�A");
		MyThread mt2=new MyThread("�߳�B");
		MyThread mt3=new MyThread("�߳�C");
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}

}
