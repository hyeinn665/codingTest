import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		String result = "";
		for(int i=0; i<num; i++) {
			str[i]=br.readLine();
		}
		for(int i=0; i<str[0].length(); i++) {
			boolean bl = false;
			for(int j=1; j<num; j++) {
				if(str[0].charAt(i)!=str[j].charAt(i)) {
					bl = true;
					break;
				}
			}
			if(bl) {
				result+="?";
			}else {
				result+=str[0].charAt(i);
			}
		}
		System.out.println(result);
	}
}
