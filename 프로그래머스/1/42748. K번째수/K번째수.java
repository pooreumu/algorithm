import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int[] cutted = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(cutted);
            result[i] = cutted[commands[i][2]-1];
        }
        return result;
    }
}