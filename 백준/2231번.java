import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int n = num;
		int count = 0;
		int result = 0;
		while(n>0) {
			n/=10;
			count++;
		} //자리수 구하기
		for(int i=n-9*count; i<num; i++) { 
			int tmp = i;
			int sum = 0;
			while(tmp!=0) {
				sum += tmp%10;
				tmp/=10;
			}
			if(sum+i==num) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
