class Solution {
    public int solution(int[] numbers, int k) {
        int ball = 0;
        for (int i = 1; i < k; i++) {
            ball = (ball + 2) % numbers.length;
        }
        return numbers[ball];
    }
}