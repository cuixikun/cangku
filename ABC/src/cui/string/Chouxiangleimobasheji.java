package cui.string;

abstract class Action1{
	public static final int EAT=1;
	public static final int SLEEP=5;
	public static final int WORK=7;
	public void command(int flag){
		//switchֻ֧����ֵ�жϣ�if֧�������ж�
		switch(flag){
		case EAT:
			this.eat();
			break;
		case SLEEP:
			this.sleep();
			break;
		case WORK:
			this.work();
			break;
		case EAT+WORK:
			this.eat();
		    this.work();
		    break;
		}
	}//��ȷ�������ʵ����ʲô
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
}
class Robot extends Action1{
	public void eat(){
		System.out.println("�����˲�������");
	}
	public void sleep(){}
	public void work(){
		System.out.println("���������ڹ���");
	}
}
class Human extends Action1{
	public void eat(){
		System.out.println("���ಹ������");
	}
	public void sleep(){
		System.out.println("������Ϣ");
	}
	public void work(){
		System.out.println("�������ڹ���");
	}
}
class Pig extends Action1{
	public void eat(){
		System.out.println("��������");
	}
	public void sleep(){
		System.out.println("����Ϣ");
	}
	public void work(){}
}
public class Chouxiangleimobasheji {
	public static void main(String args[]){
		fun(new Robot());
		fun(new Human());
		fun(new Pig());
	}
	public static void fun(Action1 act){
		act.command(Action1.EAT);
		act.command(Action1.SLEEP);
		act.command(Action1.WORK);
	}

}
