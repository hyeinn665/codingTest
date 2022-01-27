import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n : arr){
            if(n%divisor==0){
                list.add(n);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        if(list.size()==0){
            return new int[]{-1};
        }
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
