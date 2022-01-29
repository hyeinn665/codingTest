class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] st = {6,6,5,4,3,2,1};     //인덱스(일치번호갯수)로 데이터(등수) 넣기
        int win = 0;
        int zero = 0;
        for(int i=0; i<6; i++){ 
            if(lottos[i]==0){   //0의 갯수 찾기
                    zero++;
            }
            for(int j=0; j<6; j++){
                if(win_nums[i]==lottos[j]){  //당첨번호와 일치하는 갯수 구하기       
                    win++;
                }
            }
        }
        int[] answer = {st[win+zero],st[win]};  //일치하는갯수+0의갯수, 일치하는 갯수 출력
        //0의 존재유무와 상관없이 win의 갯수가 최솟값이고
        //0이 있다면 그 값을 win에 더하면 최댓값이다. 두개의 합은 번호6을 넘지않음
        return answer;
    }
}
