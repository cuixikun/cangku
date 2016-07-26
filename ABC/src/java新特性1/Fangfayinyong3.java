package java新特性1;
@FunctionalInterface
//特定类::普通方法
interface G<P>{
	public int compare(P p1,P p2);
}
public class Fangfayinyong3 {
	public static void main(String args[]){
		G<String> g=String::compareTo;
		System.out.println(g.compare("A","B"));
	}

}