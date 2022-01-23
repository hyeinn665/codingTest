import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int s = sc.nextInt();
			String a = sc.next();
			
			for(int j=0; j<a.length(); j++) {
				for(int z=0; z<s; z++) {
					System.out.print(a.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
