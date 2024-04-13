import java.util.*;

class Solution {
	public int solution(int[] scoville, int K) {
		if (Arrays.stream(scoville).allMatch(x -> x == 0)) {
			return -1;
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int s : scoville) {
			minHeap.add(s);
		}
		int count = 0;
		while (!minHeap.isEmpty() && minHeap.peek() < K) {
			int min = minHeap.poll();
			if (minHeap.isEmpty()) {
				return -1;
			}
			int secondMin = minHeap.poll();
			minHeap.add(min + secondMin * 2);
			count++;
		}

		return count;
	}
}
