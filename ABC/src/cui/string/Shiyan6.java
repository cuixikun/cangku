package cui.string;

public class Shiyan6 {
	public static void main(String args[]){
		String str="helloworld";
		if(str.indexOf("world")!=-1){
			System.out.println("可以查询到数据");
		}
	}

}



public class Shiyan6 {
	public static void main(String args[]){
		String str="helloworld";
		if(str.contains("world")){
			System.out.println("可以查询到数据");
		}
	}

}
