class Solution {
    public int solution(int n) {
        int count = 1;
        int fectorial = 1;
        while(true) {
            if (fectorial > n) {
                return count -1;
            }
            count++;
            fectorial *= count;
        }
    }
}