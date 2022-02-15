import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String num = br.readLine();
			if(num.equals("0")) {
				return;
			}
			String arr[] = new String[num.length()];
			String arr2[] = new String[num.length()];
			for(int i=0; i<num.length(); i++) {
				arr[i]=num.substring(i,i+1);
				arr2[i]=num.substring(num.length()-i-1,num.length()-i);
			}
			int count = 0;
			for(int i=0; i<num.length(); i++) {
				if(arr[i].equals(arr2[i])) {
					count++;			
				}
			}
			if(count==num.length()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}
	}
}
