package abcd;

class G{
	String info="hello";
}
class H extends G{
	int info=100;
	public void print(){
		System.out.println(this.info);//�ȿ����࣬�ٿ�����
		System.out.println(super.info);//ֱ�ӿ�����
	}
	
}
public class Jichengxingfuxie2 {
	public static void main(String args[]){
		H h=new H();
		h.print();
	}

}
