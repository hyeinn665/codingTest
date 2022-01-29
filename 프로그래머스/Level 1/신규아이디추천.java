import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();  //1단계 소문자로 바꾸기
        new_id = new_id.replaceAll("[^0-9a-z-_.]","");  //2단계 소문자,숫자,-,_,. 제외 다 삭제하기
        new_id = new_id.replaceAll("[.]{2,}",".");      //3단계 . 두번이상 중복은 하나로 치환하기
        new_id = new_id.replaceAll("^[.]|[.]$","");     //4단계 시작과 끝이 . 이면 삭제하기
        if(new_id.equals("")){                          //5단계 문자열이 존재하지않으면 a로 치환하기
            new_id+="a";                            
        }else if(new_id.length()>=16){                  //6단계 문자열의 길이가 16보다 크다면 삭제하기      
            new_id=new_id.substring(0,15);  
            new_id = new_id.replaceAll("^[.]|[.]$",""); //시작과 끝이 . 이면 삭제하기
        }
        if(new_id.length()<=2){                         //7단계 문자열길이가 2이하면 마지막 문자 반복해서 총길이 3으로 만들기
            String tmp = new_id.substring(new_id.length()-1,new_id.length());
            while(new_id.length()<3){
                new_id+=tmp;
            }
        }
        return new_id;
    }
}
