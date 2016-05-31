package cui.string;

public class Tongjishuzigeshu {
	public static void main(String[] args) {
		String s = "91254782354987012345978";
		int a[] = new int[10];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - '0']++;
		}
		for (int j = 0; j < 10; j++)
			System.out.printf(+j + ":" + a[j] + " ");
	}
}
