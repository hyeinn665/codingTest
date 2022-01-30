import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] arr = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(a1[i%5]==answers[i]){
                arr[0]++;
            }
            if(a2[i%8]==answers[i]){
                arr[1]++;
            }
            if(a3[i%10]==answers[i]){
                arr[2]++;
            }
        }
        int max = Math.max(Math.max(arr[0],arr[1]),arr[2]);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            if(max==arr[i]){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
