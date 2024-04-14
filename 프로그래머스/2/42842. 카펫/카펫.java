import java.util.*;

class Solution {
	public int[] solution(int brown, int yellow) {
		ArrayList<Integer> divisor = getDivisor(brown + yellow);
        
		if (divisor.size() % 2 == 0) {
			for (int i = 0; i < divisor.size(); i += 2) {
				if ((divisor.get(i) - 2) * (divisor.get(i + 1) - 2) == yellow) {
					return new int[] {divisor.get(i + 1), divisor.get(i)};
				}
			}
			return new int[] {divisor.get(divisor.size() - 1), divisor.get(divisor.size() - 2)};
		} else {
			for (int i = 0; i < divisor.size() - 1; i += 2) {
				if ((divisor.get(i) - 2) * (divisor.get(i + 1) - 2) == yellow) {
					return new int[] {divisor.get(i + 1), divisor.get(i)};
				}
			}
			return new int[] {divisor.get(divisor.size() - 1), divisor.get(divisor.size() - 1)};
		}
	}

	public ArrayList<Integer> getDivisor(int n) {
		int sqrt = (int)Math.sqrt(n);
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) {
				result.add(i);
				if (n / i != i) {
					result.add(n / i);
				}
			}
		}
		return result;
	}
}
