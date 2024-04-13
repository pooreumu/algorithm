import java.util.*;

class Solution {
	public int[] solution(int[] prices) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < prices.length; i++) {
			int time = 0;
			for (int j = i + 1; j < prices.length; j++) {
                time++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
			result.add(time);
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
