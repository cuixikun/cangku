package �ļ�������;

import java.io.File;

public class A4 {
	public static void main(String args[]) throws Exception{
		File file = new File("e:"+File.separator+"Media");
		print(file);
	}
	public static void print(File file){
		if(file.isDirectory()){
			File result [] = file.listFiles();//�г���Ŀ¼
			if(result != null){//��ʾ�Ѿ��г���Ŀ¼
			for(int x = 0;x<result.length;x++){
				print(result[x]);
			}
			}
		} 
		System.out.println(file);
	}

}
