package �쳣����;
class B{//��ʾ�˷�������쳣���������ô�����
	public static int div(int x,int y)throws Exception{
		int result=0;
		System.out.println("***1 �������㿪ʼ***");
		try{
		result=x/y;
		}catch(Exception e){
			throw e;//�������쳣
		}finally{
		System.out.println("***2�����������***");
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
