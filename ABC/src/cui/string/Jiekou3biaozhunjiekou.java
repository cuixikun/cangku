package cui.string;
//标准可以连接不同层的的操作类
interface USB{//定义标准一定就是接口
	public void start();
	public void stop();
}
class Computer{
	public void plugin(USB usb){//插入
		usb.start();//固定操作
		usb.stop();
	}
}
class Flash implements USB{
	public void start(){
		System.out.println("U盘开始使用");
	}
	public void stop(){
		System.out.println("U盘停止使用");
	}
}
class Print implements USB{
	public void start(){
		System.out.println("打印机开始使用");
	}
	public void stop(){
		System.out.println("打印机开始使用");
	}
}
public class Jiekou3biaozhunjiekou {
	public static void main(String args[]){
		Computer cc=new Computer();
		cc.plugin(new Flash());
		cc.plugin(new Print());
	}

}
