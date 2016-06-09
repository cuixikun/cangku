package cui.string;

public class Paixu3 {
	public static void main(String args[]){
		int data []=new int []{1,7,8,2,3,6,7,3};
			java.util.Arrays.sort(data);
			print(data);
		}
		public static void print(int temp[]){
			for(int x=0;x<temp.length;x++){
				System.out.print(temp[x]+"¡¢");
			}
			System.out.println();

}
}