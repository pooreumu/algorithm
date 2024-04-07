class Solution {
    public int solution(int a, int b) {
        return Math.max(circlePlus(a,b),circlePlus(b,a));
    }
    
    private int circlePlus(int a, int b) {
        return Integer.parseInt("" + a + b);
    }
}