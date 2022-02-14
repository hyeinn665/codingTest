import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		boolean check = false;
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(i==j) continue;
				if(sum-arr[i]-arr[j]==100) {
					arr[i]=0;
					arr[j]=0;
					check = true;
					break;
				}
				if(check) break;
			}
		}
		Arrays.sort(arr);
		for(int i=0; i<9; i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
