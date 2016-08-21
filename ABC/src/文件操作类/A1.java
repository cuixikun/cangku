package 文件操作类;

import java.io.File;

public class A1 {
	public static void main(String args[]) throws Exception{
		File file = new File("e:"+File.separator+"text.text");
		if(file.exists()){
			file.delete();
		}else{
		System.out.println(file.createNewFile());
		}
	}

}
