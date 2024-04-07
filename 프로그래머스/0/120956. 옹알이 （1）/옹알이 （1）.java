import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] possibleBabbling = {"aya", "ye", "woo", "ma"};
        
        int result = 0;
        for(String b : babbling) {
            for (String p : possibleBabbling) {
                b = b.replace(p," ");
            }
            if(b.trim().equals("")){
                result++;
            }
        }
        return result;
    }
}