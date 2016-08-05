package 基础类库;

public class System类 {
	public static void main(String args[]) throws Exception{
		long start = System.currentTimeMillis();//取得开始时间
		String str="";
		for(int x=0;x<3000;x++){
			str+=x;
		}
		long end=System.currentTimeMillis();
		System.out.println("本次操作花费时间："+(end-start));
	}

}
