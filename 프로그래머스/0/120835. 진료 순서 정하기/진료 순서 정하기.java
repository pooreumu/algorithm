import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < emergency.length; i++) {

			list.add(new int[] {emergency[i], i});
		}
		list.sort(Comparator.comparing((int[] a) -> a[0]).reversed());
		for (int i = 0; i < list.size(); i++) {
			answer[list.get(i)[1]] = i + 1;
		}
		return answer;
	}
}
