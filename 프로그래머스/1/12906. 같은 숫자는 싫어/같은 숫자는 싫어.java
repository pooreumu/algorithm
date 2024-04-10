import java.util.*;

public class Solution {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && list.get(list.size()-1).equals(arr[i])) {
                continue;
            } else {
                list.add(arr[i]);
            }
        }
        
        return list.stream().mapToInt(x -> x).toArray();
	}
}
