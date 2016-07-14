package lianshou;

public class C {
	public static void main(String args[]){
		int a=9;
		int b=9;
		while(a>=1){
			while((b<=a)&&(b>0)){
				System.out.print(a+"*"+b+"="+a*b+" ");
				b--;
			}
			System.out.println("");
			a--;
			b=a;
		}
	}

}
