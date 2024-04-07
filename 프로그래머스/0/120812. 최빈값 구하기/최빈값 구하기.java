import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int n : array) {
            String strN = "" + n;
            if(map.containsKey(strN)) {
                map.replace(strN, map.get(strN)+1);
            } else {
                map.put(strN, 1);
            }
        }
        
        String result = "";
        int value = -1;
        for (String key : map.keySet()) {
            if(map.get(key) > value) {
                result = key;
                value = map.get(key);
            }
        }
        for (String key : map.keySet()) {
            if(!result.equals(key) && map.get(key) == value) {
                return -1;
            }
        }
        
        return Integer.parseInt(result);
    }
}