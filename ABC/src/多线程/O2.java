package ���߳�;
class MyThread implements Runnable{
	private int ticket=10;
	public void run(){//��дrun()��������Ϊ�̵߳������������
		for(int x=0;x<100;x++){
			if(this.ticket>0){
				System.out.println("��Ʊ��ticket="+this.ticket--);
			}
		}
	}
}
public class O2 {
	public static void main(String args[]){
		//����MyThread����start()����������MyThread��������һ���̶߳��󣬿���ֱ������
		MyThread mt=new MyThread();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}
