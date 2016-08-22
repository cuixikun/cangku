package 文件操作类;

import java.io.File;

public class A3 {
	public static void main(String args[]) throws Exception{
		File file = new File("e:"+File.separator);
		if(file.isDirectory()){
			File result[] = file.listFiles();
			for(int x = 0;x<result.length;x++){
				System.out.println(result[x]);
			}
		}
	}

}
