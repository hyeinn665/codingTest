import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		String[] arr = num.split(" ");
		int[] narr = new int[n];
		for(int i=0; i<n; i++) {
			narr[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(narr);
		System.out.println(narr[0]+" "+narr[n-1]);
	}
}
