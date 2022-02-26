import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			arr2[i]=arr[i];
		}
		Arrays.sort(arr2);
		int rank=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int k : arr2) {
			if(!map.containsKey(k)) {
				map.put(k, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			int v = map.get(a);
			sb.append(v).append(' ');
		}
		System.out.println(sb);
	}
}
