import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int length = 0;
        for (int[] size: sizes) {
            Arrays.sort(size);
            width = width < size[0] ? size[0] : width;
            length = length < size[1] ? size[1] : length;
        }
        return width * length;
    }
}