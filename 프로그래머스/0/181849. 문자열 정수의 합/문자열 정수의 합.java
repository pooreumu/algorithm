import java.util.*;

class Solution {
    public int solution(String num_str) {
        return Arrays
            .stream(num_str.split(""))
            .map(x -> Integer.parseInt(x))
            .reduce(0,(prev,curr)->prev+curr);
    }
}