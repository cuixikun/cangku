package 异常处理;
class B{//表示此方法里的异常交给被调用处处理
	public static int div(int x,int y)throws Exception{
		int result=0;
		System.out.println("***1 除法计算开始***");
		try{
		result=x/y;
		}catch(Exception e){
			throw e;//继续抛异常
		}finally{
		System.out.println("***2除法计算结束***");
		}
		return result ;
	}
}

public class Yichangchuli {
	public static void main(String args[]){
		try{
		System.out.println(B.div(10, 0));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
