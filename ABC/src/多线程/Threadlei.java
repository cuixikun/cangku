package ���߳�;
//�̲߳�������
class MyThread extends Thread{
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
public class Threadlei {
	public static void main(String args[]){
		MyThread mt1=new MyThread("�߳�A");
		MyThread mt2=new MyThread("�߳�B");
		MyThread mt3=new MyThread("�߳�C");
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
