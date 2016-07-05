package cui.string;

interface R{
	public void funR();
}
interface S{
	public void funS();
}
//T接口同时继承了R,S两个父接口
interface T extends R,S{
	public void funR();
}
class Y implements T{
	public void funR(){}
	public void funS(){}
	public void funT(){}
}
public class Jiekou2 {
	public static void main(String args[]){
		
	}

}
