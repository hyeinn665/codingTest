import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int min = 9999;
	public static boolean[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				if(str.charAt(j)=='B') {
					arr[i][j]=true;
				}
			}
		}
		int nrow = n-7;
		int mcol = m-7;
		for(int i=0; i<nrow; i++) {
			for(int j=0; j<mcol; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}
	public static void find(int x, int y) {
		int x_end = x+8;
		int y_end = y+8;
		int count=0;
		boolean tmp = arr[x][y];
		for(int i=x; i<x_end; i++) {
			for(int j=y; j<y_end; j++) {
				if(arr[i][j]!=tmp) {
					count++;
				}
				tmp=(!tmp);
			}
			tmp=(!tmp);
		}
		count=Math.min(count, 64-count);
		min = Math.min(count, min);
	}
}
