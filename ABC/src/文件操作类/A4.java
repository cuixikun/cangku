package 文件操作类;

import java.io.File;

public class A4 {
	public static void main(String args[]) throws Exception{
		File file = new File("e:"+File.separator+"Media");
		print(file);
	}
	public static void print(File file){
		if(file.isDirectory()){
			File result [] = file.listFiles();//列出子目录
			if(result != null){//表示已经列出的目录
			for(int x = 0;x<result.length;x++){
				print(result[x]);
			}
			}
		} 
		System.out.println(file);
	}

}
