import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static int n,m;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(1,0);
		System.out.println(sb);
	}
	public static void dfs(int t, int depth) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val+" ");
			}
			sb.append('\n');
			return;
		}
		for(int i=t; i<=n; i++) {
			arr[depth] = i;
			dfs(i,depth+1);
		}
	}
}
