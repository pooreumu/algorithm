import java.util.*;

public class Solution {
    public int solution(int n) {
        int result = 0;
        String s = "" + n;
        for (int i = 0; i < s.length(); i++) {
            result += Character.getNumericValue(s.charAt(i));
        }
        return result;
    }
}