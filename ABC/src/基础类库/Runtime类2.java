package 基础类库;

public class Runtime类2 {
	public static void main(String args[]) throws Exception{
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("mspaint.exe");//调用本机程序
		Thread.sleep(2000);
		pro.destroy();//销毁进程
	}

}
