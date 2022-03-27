import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int people = Integer.parseInt(st.nextToken());
			int[] arr = new int[people];
			for(int j=0; j<people; j++) {
				arr[j]=Integer.parseInt(st.nextToken());
				sum+=arr[j];
			}
			double avg = sum/people;
			double pass = 0;
			for(int j=0; j<people; j++) {
				if(avg<arr[j]) {
					pass++;
				}
			}
			double result = Math.round(pass/people*1000*100)/1000.00;
			System.out.printf("%.3f%%\n",result);
		}
	}
}
