import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp =num;
		int count = 0;
		
		while(true) {
			tmp=((tmp%10)*10)+((tmp/10+tmp%10)%10);
			count++;
			if(tmp==num) {
				break;
			}
		}
		System.out.println(count);
	}
}
