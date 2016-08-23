package �༯;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Bk {
	private String title;
	private double price;
	public Bk(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString(){
		return "������"+this.title+"���۸�"+this.price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bk other = (Bk) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
public class Set�ӿ�3 {
	public static void main(String args[]) throws Exception{
		Set<Bk> all = new HashSet<Bk>();
		all.add(new Bk("java����",10.0));
		all.add(new Bk("java����",10.0));//ȫ����Ϣ�ظ�
		all.add(new Bk("jsp����",10.0));//�۸���Ϣ�ظ�
		all.add(new Bk("oracle����",10.3));//�����ظ�
		System.out.println(all);
	}
		
}

