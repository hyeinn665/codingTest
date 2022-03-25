import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			if(str.equals(".")) {
				break;
			}
			
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				if(ch=='[' || ch=='(') {
					stack.push(ch);
				}else if(ch==']' && !stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
				}else if(ch==')' && !stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
				}else if(ch==')' || ch==']') {
					stack.push(ch);
				}
			}
			if(stack.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}
