class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int idx = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            int[] array = new int[n];
            for (int j = 0; j < n; j++){
                array[j] = num_list[idx];
                idx++;
            }
            answer[i] = array;
        }
        return answer;
    }
}