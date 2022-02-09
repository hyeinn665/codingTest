import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 1;
		int bee = 2;
		
		if(num==1) {
			System.out.println(count);
		}
		else{
			while(bee<=num) {
				bee = bee+(6*count);
				count++;
			}
			System.out.println(count);
		}
	}
}
