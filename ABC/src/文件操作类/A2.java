package 文件操作类;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A2 {
	public static void main(String args[]) throws Exception{
		File file = new File("e:"+File.separator+"ChromeSetup.exe");
		System.out.println(file.getPath());
		if(file.exists()){
			System.out.println("是否是文件："+(file.isFile()));
			System.out.println("是否是目录："+(file.isDirectory()));
			System.out.println("文件大小："+(new BigDecimal((double) file.length()/1024/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP))+"M");
			System.out.println("上次修改时间："+new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss.SSS").format(new Date(file.lastModified())));
		}
	}

}
