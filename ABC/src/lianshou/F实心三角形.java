package lianshou;

public class F实心三角形 {
	public static void main(String args[]){
		int n=5;
		String c=" ";
		String x="*";
		for(int i=0;i<n;i++){
			for(int k=0;k<n-i-1;k++){
				System.out.print(c);
			}
			for(int k=0;k<i+1;k++){
				System.out.print(x);
			}
			for(int k=0;k<i;k++){
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
