package cui.string;
//��׼�������Ӳ�ͬ��ĵĲ�����
interface USB{//�����׼һ�����ǽӿ�
	public void start();
	public void stop();
}
class Computer{
	public void plugin(USB usb){//����
		usb.start();//�̶�����
		usb.stop();
	}
}
class Flash implements USB{
	public void start(){
		System.out.println("U�̿�ʼʹ��");
	}
	public void stop(){
		System.out.println("U��ֹͣʹ��");
	}
}
class Print implements USB{
	public void start(){
		System.out.println("��ӡ����ʼʹ��");
	}
	public void stop(){
		System.out.println("��ӡ����ʼʹ��");
	}
}
public class Jiekou3biaozhunjiekou {
	public static void main(String args[]){
		Computer cc=new Computer();
		cc.plugin(new Flash());
		cc.plugin(new Print());
	}

}
