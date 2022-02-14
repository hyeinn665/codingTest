import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int[] alpa1 = new int[26];
		int[] alpa2 = new int[26];
		for(int i=0; i<str1.length(); i++) {
			alpa1[str1.charAt(i)-'a']++;
		}
		for(int i=0; i<str2.length(); i++) {
			alpa2[str2.charAt(i)-'a']++;
		}
		int count = 0;
		for(int i=0; i<26; i++) {
			count += Math.abs(alpa1[i]-alpa2[i]);
		}
		System.out.println(count);
	}
}
