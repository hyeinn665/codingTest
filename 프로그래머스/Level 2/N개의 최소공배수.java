class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i=0; i<arr.length; i++){
            int result = gcd(answer,arr[i]);
            answer = answer*arr[i]/result;
        }
        return answer;
    }
    public static int gcd(int a, int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        if(x%y==0){
            return y;
        }
        return gcd(y,x%y);
    }
}
