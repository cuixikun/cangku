package cui.string;

public class Newplusone {
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			for(int j=1;j<11-i;j++){ 
				System.out.print(' '); 
				}
			for(int s=i;s>0;s--){
				System.out.print(s);
			}
			for(int s=2;s<i+1;s++){
				System.out.print(s);
			}
			System.out.println();
		}
	System.out.println("*98765432123456789*");
	}
}
