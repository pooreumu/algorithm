class Solution {
    public int solution(int n) {
        return getLCM(6,n) / 6;
    }
    
    private int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
    
    private int getLCM(int num1, int num2) {
        return (num1 * num2) / getGCD(num1, num2);
    }
}