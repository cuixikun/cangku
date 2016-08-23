package 类集;

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
		return "书名："+this.title+"，价格："+this.price;
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
public class Set接口2 {
	public static void main(String args[]) throws Exception{
		Set<Bok> all = new TreeSet<Bok>();
		all.add(new Bok("java开发",10.0));
		all.add(new Bok("java开发",10.0));//全部信息重复
		all.add(new Bok("jsp开发",10.0));//价格信息重复
		all.add(new Bok("oracle开发",10.3));//都不重复
		System.out.println(all);
	}
		
}

	
		




