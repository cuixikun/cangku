package ���߳�;
class MyThread extends Thread{
	private int ticket=10;
	public void run(){//��дrun()��������Ϊ�̵߳������������
		for(int x=0;x<100;x++){
			if(this.ticket>0){
				System.out.println("��Ʊ��ticket="+this.ticket--);
			}
		}
	}
}
public class One {
	public static void main(String args[]){
		//����MyThread����start()����������MyThread��������һ���̶߳��󣬿���ֱ������
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		MyThread mt3=new MyThread();
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
