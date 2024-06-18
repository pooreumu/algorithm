import java.util.*;

class Solution {
	public String solution(String letter) {
		Map<Character, Boolean> vowels = new HashMap<>();
		vowels.put('a', true);
		vowels.put('e', true);
		vowels.put('i', true);
		vowels.put('o', true);
		vowels.put('u', true);

		StringBuilder sb = new StringBuilder();
		for (char c : letter.toCharArray()) {
			if (!vowels.containsKey(c)) {
				sb.append(c);
			}
		}
		return sb.toString();

	}
}
