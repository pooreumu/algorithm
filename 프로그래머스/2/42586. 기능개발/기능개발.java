import java.util.*;
import java.util.stream.*;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> list = Arrays
			.stream(progresses)
			.boxed()
			.collect(Collectors.toCollection(ArrayList::new));

		List<Integer> result = new ArrayList<>();
		int pointer = 0;
		while (pointer < list.size()) {
			int cnt = 0;
			while (pointer < list.size() && list.get(pointer) >= 100) {
				pointer++;
				cnt++;
			}
            if(cnt > 0) {
                result.add(cnt);
            }
			for (int i = pointer; i < speeds.length; i++) {
				list.set(i, list.get(i) + speeds[i]);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
