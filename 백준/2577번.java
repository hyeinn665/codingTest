package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		long num = n*n2*n3;
		String nu = String.valueOf(num);
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<nu.length(); j++) {
				char iNum = (char)(i+48);
				if(nu.charAt(j)==iNum) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}2
