import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(integers));
        return Math.min(nums.length/2, set.size());
    }
}