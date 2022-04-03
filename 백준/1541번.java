import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("-");
		int sum = Integer.MAX_VALUE;
		for(int i=0; i<str.length; i++) {
			int tmp = 0;
			String[] add = str[i].split("\\+");
			for(int j=0; j<add.length; j++) {
				tmp += Integer.parseInt(add[j]);
			}
			if(sum == Integer.MAX_VALUE) {
				sum = tmp;
			}else {
				sum -= tmp;
			}
		}
		System.out.println(sum);
	}
}
