package �������;

public class Runtime��2 {
	public static void main(String args[]) throws Exception{
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("mspaint.exe");//���ñ�������
		Thread.sleep(2000);
		pro.destroy();//���ٽ���
	}

}
