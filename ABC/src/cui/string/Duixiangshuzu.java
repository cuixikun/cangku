package cui.string;

class Book{
	private String title;
	private double price;
	public Book(String t,double p){
		title=t;
		price=p;
	}
	public String getInfo(){
		return"������"+title+"���۸�"+price;
	}
}


public class Duixiangshuzu {
	public static void main(String args[]){
		//������һ��3�����ȵĶ�������
		Book books[]=new Book[3];
		//���������е�ÿ�����ݶ���Ҫ�ֱ�ʵ����
		books[0]=new Book("java",78.9);
		books[1]=new Book("java",78.9);
		books[2]=new Book("java",78.9);
		for(int x=0;x<books.length;x++){
			System.out.println(books[x].getInfo());
		}
	}

}
