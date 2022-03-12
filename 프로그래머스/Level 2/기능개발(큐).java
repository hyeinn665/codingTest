import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<speeds.length; i++){
            q.add((int)(Math.ceil(((100-progresses[i])/(double)speeds[i]))));
        }
        
        while(!q.isEmpty()){
            int day = q.poll();
            int cnt = 1; 
            
            while(!q.isEmpty() && day>=q.peek()){
                cnt++;
                q.poll();
            }
            list.add(cnt);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
