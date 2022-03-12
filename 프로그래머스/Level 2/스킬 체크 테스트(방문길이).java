import java.util.ArrayList;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        ArrayList<String> visit = new ArrayList<String>();
        
        for(int i=0; i<dirs.length(); i++){
            int reX = x;
            int reY = y;
            char c = dirs.charAt(i);
            if(c=='U'&&y<5){
                y++;
            }else if(c=='D'&&y>-5){
                y--;
            }else if(c=='R'&&x<5){
                x++;
            }else if(c=='L'&&x>-5){
                x--;
            }
            String xy = Integer.toString(x);
            xy += Integer.toString(y);
            String reXY = Integer.toString(reX);
            reXY += Integer.toString(reY);
            String route1 = xy+reXY;
            String route2 = reXY+xy;
            
            if(!visit.contains(route1)&&!visit.contains(route2)&&!route1.equals(route2)){
                visit.add(route1);
                visit.add(route2);
            }
        }
        answer = visit.size() / 2;
        return answer;
    }
}
