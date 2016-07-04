package cui.string;

abstract class Action1{
	public static final int EAT=1;
	public static final int SLEEP=5;
	public static final int WORK=7;
	public void command(int flag){
		//switch只支持数值判断，if支持条件判断
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
	}//不确定子类的实现是什么
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
}
class Robot extends Action1{
	public void eat(){
		System.out.println("机器人补充能量");
	}
	public void sleep(){}
	public void work(){
		System.out.println("机器人正在工作");
	}
}
class Human extends Action1{
	public void eat(){
		System.out.println("人类补充能量");
	}
	public void sleep(){
		System.out.println("人类休息");
	}
	public void work(){
		System.out.println("人类正在工作");
	}
}
class Pig extends Action1{
	public void eat(){
		System.out.println("猪补充能量");
	}
	public void sleep(){
		System.out.println("猪休息");
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
