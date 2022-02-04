class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int num = 0;  //약수개수 초기화
            for(int j=1; j<=i; j++){
                if(i%j==0){ //약수일떄
                    num++;
                }
            }
            if(num%2==0){   //약수의 개수가 짝수일때
                answer += i;
              }else{        //약수의 개수가 홀수일때
                answer -=i;
            }
        }
        return answer;
    }
}
