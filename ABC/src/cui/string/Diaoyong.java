package cui.string;

class Book{
	String title;
	double price;
	public void getInfo(){
		System.out.println("ͼ������:"+title+",�۸�"+price);
	}
}

public class Diaoyong {
	public static void main(String[] args){
		Book bk=new Book();//����ʵ��������
		bk.title="Java����";
		bk.price=99.9;//������������
		bk.getInfo();//�������е�getInfo()����
	}

}
