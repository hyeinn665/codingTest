import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		boolean[] bl = new boolean[101];
		int count = 0;
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(bl[num]==true) {
				count++;
			}
			bl[num]=true;
		}
		
		System.out.println(count);
	}
}
