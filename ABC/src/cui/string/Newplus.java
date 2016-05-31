package cui.string;

public class Newplus {
	public static void main(String[] args){
		char s[] = {'','','','','','','','','','1','','','','','','','','',''};
		System.out.println(s);
		for (int i=2;i<10;i++){
			s[10-i]=(char)('0'+i);
			s[8+i]=(char)('0'+i);
			System.out.println(s);
		}
		s[0]='*';
		s[18]='*';
		System.out.println(s);
	}
}
