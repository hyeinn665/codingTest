import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int tmp = 0;
		
		while(count<num) {
			tmp++;
			count = tmp * (tmp+1)/2;
		}
		if(tmp%2==0) {
			int top = tmp-(count-num);
			int bottom = (count-num)+1;
			System.out.println(top+"/"+bottom);
		}else {
			int top = (count-num)+1;
			int bottom = tmp-(count-num);
			System.out.println(top+"/"+bottom);
		}
	}
}
