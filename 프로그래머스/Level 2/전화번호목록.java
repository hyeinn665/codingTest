import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> map = new HashMap<String, String>();
        for(String str : phone_book){
            map.put(str,str);
        }
        for(String k : phone_book){
            for(int i=0; i<k.length(); i++){
                if(map.containsKey(k.substring(0,i))){
                    return false;
                }
            }
        }
        return answer;
    }
}
