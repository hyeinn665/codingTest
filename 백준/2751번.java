import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[2000001];
		for(int i=0; i<n; i++) {
			arr[sc.nextInt()+1000000]=true;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]) {
				sb.append(i-1000000).append('\n');
			}
		}
		System.out.println(sb);
	}
}
