package 异常处理;
class A{//表示此方法里的异常交给被调用处处理
	public static int div(int x,int y)throws Exception{
		return x/y;
	}
}
public class Throw {
	public static void main(String args[]){
		try{
		System.out.println(A.div(10, 0));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
