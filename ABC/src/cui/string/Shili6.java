package cui.string;

class Desk{
	private String title;
	private double price;
    public Desk(String title,double price){
    	this.title=title;
    	this.price=price;
    }
    public boolean compare(Desk desk){
    	if(desk==null){
    		return false;
    	}
    	if(this==desk){
    		return true;
    	}
    	//当前对象this（调用方法对象，b1引用）
    	//传递的对象desk（引用传递，就是b2引用）
    	if(this.title.equals(desk.title)&&this.price==desk.price){
    		return true;
    	}else{
    		return false;
    	}
    }
    
}
public class Shili6 {
	public static void main(String args[]){
		Desk d1=new Desk("java",89.0);
		Desk d2=new Desk("java",89.0);
		if(d1.compare(d2)){
			System.out.println("是同一个对象！");
		}else{
			System.out.println("不是同一个对象！");
		}
	}

}
