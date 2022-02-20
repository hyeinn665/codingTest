import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[2001];
    //counting sort 정렬
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(br.readLine())+1000] = true;
		}
		for(int i=0; i<2001; i++) {
			if(arr[i]) {
				System.out.println(i-1000);
			}
		}
	}
}
