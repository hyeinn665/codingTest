class Solution {
    public int solution(int n) {
        int count=0;
        for(int i=1; i<=n; i++){
            int answer = 0;
            for(int j=i; j<=n; j++){
                answer+=j;
                if(answer==n){
                    count++;
                    break;
                }else if(answer>n){
                    break;
                }
            }
        }
        return count;
    }
}
