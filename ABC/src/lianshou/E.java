package lianshou;

public class E {
	public static void main(String args[]){
		int sum;
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				sum=x*y;
				System.out.print(x+"*"+y+"="+sum+"\t");
			}
			System.out.println("");
		}
	}

}
