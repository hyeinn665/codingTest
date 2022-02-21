import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] count = new int[8001];
		int sum = 0;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i]=num;
			count[num+4000]++;
			sum+=num;
		}
		Arrays.sort(arr);
		int avg = (int)Math.round((double)sum/n); //평균
		int center = arr[n/2];                    //중앙값
		int range = Math.abs(arr[n-1]-arr[0]);    //범위
		
    //최빈값 구하기
		int max=0;
		int mode = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<count.length; i++) {
			if(max==count[i]) {
				list.add(i-4000);
			}else if(max<count[i]) {
				max = count[i];
				list.clear();
				list.add(i-4000);
			}
		}
		if(list.size()>1) {
			Collections.sort(list);
			mode = list.get(1);
		}else {
			mode = list.get(0);
		}
    
		System.out.println(avg);
		System.out.println(center);
		System.out.println(mode);
		System.out.println(range);
		
	}
}
