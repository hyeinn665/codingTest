class Solution {
    public String solution(int n) {
        String answer = "";
        String[] rest = {"4","1","2"};
        while(n>0){
            int i = n%3;
            n/=3;
            if(i==0){
                n-=1;
            }
            answer = rest[i] + answer;
        }
        return answer;
    }
}
