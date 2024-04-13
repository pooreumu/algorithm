import java.util.*;

class Solution {
	public int solution(int[] priorities, int location) {
		LinkedList<Card> newPriorities = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			newPriorities.add(new Card(i, priorities[i]));
		}

		int result = 1;
		while (true) {
			Card polledCard = newPriorities.poll();
			if (
				newPriorities.stream()
					.anyMatch(priority -> priority.priority > Objects.requireNonNull(polledCard).priority)
			) {
				newPriorities.add(polledCard);
			} else {
				if (Objects.requireNonNull(polledCard).index == location) {
					return result;
				} else {
					result++;
				}
			}
		}
	}

	public class Card {
		int index;
		int priority;

		public Card(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}
	}
}
