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
    	//��ǰ����this�����÷�������b1���ã�
    	//���ݵĶ���desk�����ô��ݣ�����b2���ã�
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
			System.out.println("��ͬһ������");
		}else{
			System.out.println("����ͬһ������");
		}
	}

}
