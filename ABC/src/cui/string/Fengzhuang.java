package cui.string;

class Book{
	private String title;
	private double price;
	public void setTitle(String t){
		title=t;
	}
	public void setPrice(Double p){
		if(p>0.0){
		price=p;
		}
	}
	public String getTitle(){
		return title;
	}
	public Double getPrice(){
		return price;
	}
	public void getInfo(){
		System.out.println("ͼ������:"+title+",�۸�"+price);
	}
}


public class Fengzhuang {
	public static void main(String[] args){
		Book bk=new Book();//����ʵ��������
		bk.setTitle("Java����");
		bk.setPrice(99.9);//������������
		bk.getInfo();
	}
}