import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toUpperCase();
		int[] alpa = new int[26];
		int max = 0;
		int index = 0;
		for(int i=0; i<s.length(); i++) {
			alpa[(int)s.charAt(i)-65]++;
		}
		for(int i=0; i<alpa.length; i++) {
			if(max<alpa[i]) {
				max = alpa[i];
				index = i;
			}else if(max == alpa[i]) {
				index = -1;
			}
		}
		System.out.println((index==-1)?'?':(char)(index+65));
	}
}
