package 基础类库;

public class Runtime类 {
	public static void main(String args[]) throws Exception{
		Runtime run=Runtime.getRuntime();//取得Runtime类的实例化对象
		System.out.println("1、MAX ="+run.maxMemory());
		System.out.println("1、TOTAL ="+run.totalMemory());
		System.out.println("1、Free ="+run.freeMemory());
		String str="";
		for(int x=0;x<10000;x++){
			str+=x;//产生大量垃圾
		}
		System.out.println("2、MAX ="+run.maxMemory());
		System.out.println("2、TOTAL ="+run.totalMemory());
		System.out.println("2、Free ="+run.freeMemory());
		run.gc();//释放垃圾空间
		System.out.println("3、MAX ="+run.maxMemory());
		System.out.println("3、TOTAL ="+run.totalMemory());
		System.out.println("3、Free ="+run.freeMemory());
	}

}
