package cui.string;

public class Shiyan10 {
	public static void main(String args[]){
		String str="������20|���ģ�30|���壺40";
		String result[]=str.split("\\|");
		for(int x=0;x<result.length;x++){
			String temp[]=result[x].split("��");
			System.out.println("������"+temp[0]+"�����䣺"+temp[1]);
		}
	}

}
