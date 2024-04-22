class Solution {
    public int[] solution(int money) {
        int maxAmericanoCount = money / 5500;
        int remainingMoney = money % 5500;
        return new int[] {maxAmericanoCount, remainingMoney};
    }
}