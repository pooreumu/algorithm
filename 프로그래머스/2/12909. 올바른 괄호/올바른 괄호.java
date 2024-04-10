import java.util.*;

class Solution {
	boolean solution(String s) {
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push("(");
			} else {
				try {
					stack.pop();
				} catch (Exception e) {
					return false;
				}
			}
		}
		return stack.empty();
	}
}
