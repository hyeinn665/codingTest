import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;//시간
        int sum = 0;//다리에 있는 트럭의 무게
        Queue<Integer> q = new LinkedList<>();
        for(int t : truck_weights){
            while(true){
                if(q.isEmpty()){
                    q.add(t);
                    sum += t;
                    time++;
                    break;
                }else if(q.size()==bridge_length){
                    sum -= q.poll();
                }else{
                    if(t + sum > weight){
                        time++;
                        q.add(0);
                    }else{
                        q.add(t);
                        sum += t;
                        time++;
                        break;
                    }
                }
            }
        }
        int answer = bridge_length + time;
        return answer;
    }
}
