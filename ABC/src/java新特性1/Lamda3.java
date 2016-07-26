package javaĞÂÌØĞÔ1;
interface D{
	public int add(int x,int y);
}
public class Lamda3 {
	public static void main(String args[]){
		fun((s1,s2)-> s1+s2);
	}//             {return s1+s2;}
	public static void fun(D d){
		System.out.println(d.add(10, 20));
	}

}
