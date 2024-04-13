import java.util.*;

class Solution {
	public int solution(int[] priorities, int location) {
		LinkedList<Map<String, Integer>> newPriorities = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			Map<String, Integer> map = new HashMap<>();
			map.put("index", i);
			map.put("priority", priorities[i]);
			newPriorities.add(map);
		}

		int result = 1;
		while (true) {
			Map<String, Integer> polled = newPriorities.poll();
			if (newPriorities.stream()
				.anyMatch(priority -> priority.get("priority") > Objects.requireNonNull(polled).get("priority"))) {
				newPriorities.add(polled);
			} else {
				if (Objects.requireNonNull(polled).get("index").equals(location)) {
					return result;
				} else {
					result++;
				}
			}
		}
	}
}
