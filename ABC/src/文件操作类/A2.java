package �ļ�������;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A2 {
	public static void main(String args[]) throws Exception{
		File file = new File("e:"+File.separator+"ChromeSetup.exe");
		System.out.println(file.getPath());
		if(file.exists()){
			System.out.println("�Ƿ����ļ���"+(file.isFile()));
			System.out.println("�Ƿ���Ŀ¼��"+(file.isDirectory()));
			System.out.println("�ļ���С��"+(new BigDecimal((double) file.length()/1024/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP))+"M");
			System.out.println("�ϴ��޸�ʱ�䣺"+new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss.SSS").format(new Date(file.lastModified())));
		}
	}

}
