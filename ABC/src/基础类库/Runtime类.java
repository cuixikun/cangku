package �������;

public class Runtime�� {
	public static void main(String args[]) throws Exception{
		Runtime run=Runtime.getRuntime();//ȡ��Runtime���ʵ��������
		System.out.println("1��MAX ="+run.maxMemory());
		System.out.println("1��TOTAL ="+run.totalMemory());
		System.out.println("1��Free ="+run.freeMemory());
		String str="";
		for(int x=0;x<10000;x++){
			str+=x;//������������
		}
		System.out.println("2��MAX ="+run.maxMemory());
		System.out.println("2��TOTAL ="+run.totalMemory());
		System.out.println("2��Free ="+run.freeMemory());
		run.gc();//�ͷ������ռ�
		System.out.println("3��MAX ="+run.maxMemory());
		System.out.println("3��TOTAL ="+run.totalMemory());
		System.out.println("3��Free ="+run.freeMemory());
	}

}
