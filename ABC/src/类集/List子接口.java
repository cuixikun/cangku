package �༯;

import java.util.ArrayList;
import java.util.List;

public class List�ӽӿ� {
	public static void main(String args[]) throws Exception{
		//�����˷��ͣ���֤�˼��������е��������Ͷ�һ��
		List<String> all = new ArrayList<String>();
		System.out.println("���ȣ�"+all.size()+"���Ƿ�Ϊ�գ�"+all.isEmpty());
		all.add("hello");
		all.add("hello");//���Ա����ظ�
		all.add("world");
		System.out.println("���ȣ�"+all.size()+"���Ƿ�Ϊ�գ�"+all.isEmpty());
		for(int x=0;x<all.size();x++){
			String str = all.get(x);
			System.out.println(str);
		}
	}

}
