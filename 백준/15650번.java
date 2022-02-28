import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static int n,m;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(1,0);
	}
	public static void dfs(int t, int depth) {
		if(depth == m) {
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		for(int i=t; i<=n; i++) {
				arr[depth] = i;
				dfs(i+1,depth+1);
		}
	}
}
