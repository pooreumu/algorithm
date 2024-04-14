import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String numbers) {
        List<String> cards = List.of(numbers.split(""));
        List<String> result = new ArrayList<>();
		for (int i = 0; i < cards.size(); i++) {
            result = getCombination(cards.get(i), result);
		}
        
        Set<Integer> resultSet = result.stream()
			.map(Integer::parseInt)
			.collect(Collectors.toSet());
        
        return (int)resultSet.stream()
            .filter(this::isPrime)
            .count();
    }
    
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public List<String> getCombination(String number, List<String> com) {
		List<String> list = new ArrayList<>(com);
		list.add(number);
		for (int i = 0; i < com.size(); i++) {
			String str = com.get(i);
			for (int j = 0; j <= str.length(); j++) {
				StringBuilder sb = new StringBuilder(str);
				sb.insert(j, number);
				list.add(sb.toString());
			}
		}
		return list;
	}
}