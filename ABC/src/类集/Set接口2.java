package �༯;

import java.util.Set;
import java.util.TreeSet;

class Bok implements Comparable<Bok>{
	private String title;
	private double price;
	public Bok(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "������"+this.title+"���۸�"+this.price;
	}
	@Override
	public int compareTo(Bok o) {
		if(this.price>o.price){
			return 1;
		}else if(this.price<o.price){
			return -1;
		}else{
		return this.title.compareTo(o.title);
		}
	}
}
public class Set�ӿ�2 {
	public static void main(String args[]) throws Exception{
		Set<Bok> all = new TreeSet<Bok>();
		all.add(new Bok("java����",10.0));
		all.add(new Bok("java����",10.0));//ȫ����Ϣ�ظ�
		all.add(new Bok("jsp����",10.0));//�۸���Ϣ�ظ�
		all.add(new Bok("oracle����",10.3));//�����ظ�
		System.out.println(all);
	}
		
}

	
		




