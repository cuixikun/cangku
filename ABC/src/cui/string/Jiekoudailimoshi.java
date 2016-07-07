package cui.string;

interface Subject{//整个操作核心主题
	public void makeBaby();//整个××的的核心功能
}
class RealSubject implements Subject{
	public void makeBaby(){
		System.out.println("皇帝正在xx");
	}
}
class ProxySubject implements Subject{
	private Subject subject;
	//要接收一个真实主题的操作对象
	public ProxySubject(Subject subject){
		this.subject=subject;
	}
	public void prepare(){
		System.out.println("为xx准备");
	}
	public void makeBaby(){
		this.prepare();
		this.subject.makeBaby();//告诉皇帝开始xx
		this.destory();
	}
	public void destory(){
		System.out.println("完事");
	}
}
public class Jiekoudailimoshi {
	public static void main(String args[]){
		Subject sub=new ProxySubject(new RealSubject());
		sub.makeBaby();//调用代理主题操作
	}

}
