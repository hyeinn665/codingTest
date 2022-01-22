import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] arr = new double[num];
		double max = 0.0;
		double sum = 0;
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		for(int i=0; i<num; i++) {
			arr[i] = arr[i]/max*100;
			sum += arr[i];
		}
		System.out.println(sum/num);
	}
}
