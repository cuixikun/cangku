package 基础类库;
class Member{
	public Member(){
		System.out.println("哈斯给");
	}
	protected void finalize() throws Throwable{
		System.out.println("德玛西亚");
		throw new Exception("雄霸天下");
	}
}
public class System类2 {
	public static void main(String args[]) throws Exception{
		Member mem = new Member();//会出现一些辅助操作
		mem=null;//会产生垃圾
		System.gc();//手工处理垃圾收集，雄霸天下会消失
	}

}
