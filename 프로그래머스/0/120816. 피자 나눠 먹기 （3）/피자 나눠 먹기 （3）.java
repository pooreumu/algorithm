class Solution {
    public int solution(int slice, int n) {
        float newSlice = slice;
        return (int) Math.ceil(n / newSlice);
    }
}