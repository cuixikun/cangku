package �쳣����;
class A{//��ʾ�˷�������쳣���������ô�����
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
