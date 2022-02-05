import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		Integer[] arr = new Integer[num.length()];
		for(int i=0; i<num.length(); i++) {
			arr[i] = Integer.parseInt(num.substring(i, i+1));
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
