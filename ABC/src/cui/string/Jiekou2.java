package cui.string;

interface R{
	public void funR();
}
interface S{
	public void funS();
}
//T�ӿ�ͬʱ�̳���R,S�������ӿ�
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
