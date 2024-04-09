import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] sNumbers = Arrays
            .stream(numbers)
            .sorted()
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(sNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        
        boolean isAllZero = Arrays.stream(sNumbers).allMatch(x -> x.equals("0"));
        return isAllZero ? "0" : String.join("", sNumbers);
    }
}