package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String test;
		int[] score = new int[n];
		int win;
		for(int i=0; i<n; i++) {
			win=0;
			test = sc.next();
			for(int j=0; j<test.length(); j++) {
				if(test.charAt(j)=='O') {
					win++;
				}else {
					win=0;
				}
				score[i] += win;
			}
			System.out.println(score[i]);
		}
	}
}
