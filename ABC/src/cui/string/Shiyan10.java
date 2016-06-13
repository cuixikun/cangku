package cui.string;

public class Shiyan10 {
	public static void main(String args[]){
		String str="张三：20|李四：30|王五：40";
		String result[]=str.split("\\|");
		for(int x=0;x<result.length;x++){
			String temp[]=result[x].split("：");
			System.out.println("姓名："+temp[0]+"，年龄："+temp[1]);
		}
	}

}
