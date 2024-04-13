import java.util.*;

class Solution {
	public int[] solution(String[] operations) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (String operation : operations) {
			String[] operationArray = operation.split(" ");
			if (operationArray[0].equals("I")) {
				maxHeap.add(Integer.parseInt(operationArray[1]));
				minHeap.add(Integer.parseInt(operationArray[1]));
			} else if (operationArray[1].equals("-1")) {
				Integer polled = minHeap.poll();
				maxHeap.remove(polled);
			} else {
				Integer polled = maxHeap.poll();
				minHeap.remove(polled);
			}
		}
		int resultMax = (maxHeap.peek() != null) ? maxHeap.poll() : 0;
		int resultMin = (minHeap.peek() != null) ? minHeap.poll() : 0;
		return new int[] {resultMax, resultMin};
	}
}
