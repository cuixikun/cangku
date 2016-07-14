package lianshou;

public class B {
	public static void main(String args[]){
		String a="8907653421345678";
		int b[]=new int[10];
		for(int c=0;c<a.length();c++){
			b[a.charAt(c)-'0']++;
		}
		for(int d=0;d<10;d++){
			System.out.printf("%d:%d ",d,b[d]);
		}
	}

}
