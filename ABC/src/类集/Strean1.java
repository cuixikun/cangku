package �༯;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strean1 {
	public static void main(String args[]) throws Exception{
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hAllo");
		all.add("world");
		all.add("world");
		all.add("good");
		all.add("geed");
		all.add("gcvdd");
		all.add("gsvad");
		all.add("gbcacmd");
		Stream<String> stream = all.stream();//ȡ����stream�����
		//System.out.println(stream.count());//ȡ�����ݸ���
		//System.out.println(stream.distinct().count());//ȡ�������ظ����ݸ���
		//ȥ���ظ������γ��µļ������ݣ������ǲ������ظ����ݵļ���
		//List<String> newAll = stream.distinct().collect(Collectors.toList());
		//newAll.forEach(System.out::println);
		//���˲�����ʹ���˶����Ժ���ʽ�ӿڣ�ʹ����string���е�contains()������                                                 // �������� ȡ����
		List<String> newAll = stream.distinct()
				.map((x)->x.toLowerCase())
				.skip(2).limit(2)
				.filter((x) ->x.contains("a"))
				.collect(Collectors.toList());
		newAll.forEach(System.out::println);//������ִ�Сд
	}

}
