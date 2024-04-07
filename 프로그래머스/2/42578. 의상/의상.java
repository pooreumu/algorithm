import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (String[] c : clothes) {
            String item = c[0];
            String part = c[1];
            
            if(map.containsKey(part)) {
                map.get(part).add(item);
                map.put(part, map.get(part));
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(item);
                
                map.put(part, list);
            }
        }
        
        int result = 1; 
        for (String key : map.keySet()) {
            result *= (map.get(key).size() + 1);
        }
        
        return result - 1;
    }
}