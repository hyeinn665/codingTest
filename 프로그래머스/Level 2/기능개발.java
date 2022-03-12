class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] tmp = new int[100];
        int day = 0;
        for(int i=0; i<speeds.length; i++){
            while(progresses[i]+speeds[i]*day < 100){
                day++;
            }
            tmp[day]++;
        }
        int count = 0;
        for(int n : tmp){
            if(n!=0){
                count++;
            }
        }
        int[] answer = new int[count];
        count=0;
        for(int n : tmp){
            if(n!=0){
                answer[count++] = n;
            }
        }
        return answer;
    }
}
