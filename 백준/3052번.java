package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] answer = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			answer[i] = arr[i]%42;
		}
		int count = 0;
		for(int i=0; i<10; i++) {
			int tmp = 0;
			for(int j=i+1; j<10; j++) {
				if(answer[i]==answer[j]) {
					tmp++;
				}
			}
			if(tmp==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
