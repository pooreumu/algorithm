import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer>list = new ArrayList<>();
		for (int number : numbers) {
			list.add(number);
		}

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.get(0));
            list.remove(0);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
