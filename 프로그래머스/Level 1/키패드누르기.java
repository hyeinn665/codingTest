import java.util.*;
class Solution {
    int[][] keyy = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,1},{3,2}}; //2차원배열
    public int math(int number, int pos){   //오른손, 왼손과 현재 숫자사이의 거리 구하는 메소드
        int x = Math.abs((keyy[number-1][0])-(keyy[pos-1][0]));
        int y = Math.abs((keyy[number-1][1])-(keyy[pos-1][1]));
        return x+y; //x와 y값 따로 구해서 더한 값
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;  //*위치
        int right = 12; //#위치
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==0){  //0은 11로 바꿔버리기
                    numbers[i]=11;
                }
                //메소드안쓰고 구했던 방법
                //int rx = Math.abs((keyy[numbers[i]-1][0])-(keyy[right-1][0]));
                //int ry = Math.abs((keyy[numbers[i]-1][1])-(keyy[right-1][1]));
                //int lx = Math.abs((keyy[numbers[i]-1][0])-(keyy[left-1][0]));
                //int ly = Math.abs((keyy[numbers[i]-1][1])-(keyy[left-1][1]));
                
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                left = numbers[i];
                answer+="L";
            }else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                right = numbers[i];
                answer+="R";
            }else{
                if(math(numbers[i],right)<math(numbers[i],left)){       //왼손의 거리가 더 멀때
                    right = numbers[i];
                    answer+="R";
                }else if(math(numbers[i],right)>math(numbers[i],left)){ //오른손의 거리가 더멀때
                    left = numbers[i];
                    answer+="L";
                }
                else {  //양손의 거리가 같을때
                    if(hand.equals("right")){ //오른손잡이
                        right = numbers[i];
                        answer+="R";
                    }
                    else if(hand.equals("left")){ //왼손잡이
                        left =numbers[i];
                        answer+="L";
                    }
                }
            }
        }
        return answer;
    }
}
