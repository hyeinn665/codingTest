import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			Stack<Character> stack = new Stack<Character>();
			String data =br.readLine();
			for(int j=0; j<data.length(); j++) {
				if(data.charAt(j)=='(') {
					stack.push('(');
				}else {
					if(stack.isEmpty()) {
						stack.push('(');
						break;
					}
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
}
