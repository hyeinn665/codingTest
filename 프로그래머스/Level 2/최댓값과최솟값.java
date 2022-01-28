import java.util.*;
class Solution {
    public String solution(String s) {
        String[] answer = s.split(" "); //공백제거
        int[] num = new int[answer.length]; //answer를 정수값으로 저장할 배열 선언
        
        for(int i=0; i<answer.length; i++){
            num[i]= Integer.parseInt(answer[i]);  //정수로 변환
        }
        Arrays.sort(num); //오름순으로 정렬
        return num[0]+" "+num[answer.length-1]; //최솟값과 최댓값 출력
    }
}
