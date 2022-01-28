class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<10; i++){
            s = s.replace(arr[i], Integer.toString(i)); //영단어에 맞는 숫자로 변환
        }
        answer = Integer.parseInt(s);   //문자열타입에서 정수타입으로 변환
        return answer;
    }
}
