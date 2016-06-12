package cui.string;

public class Shiyan4 {
	public static void main(String args[]){
		String stra="hello";
		String strb="HEllo";
		System.out.println(stra.compareTo(strb));
		//利用大于小于0的方式进行判断大小
	    if(stra.compareTo(strb)>0){
	    	System.out.println("大于");
	    }//现在只有String的类的对象才具有大小的关系判断
	}
	

}
