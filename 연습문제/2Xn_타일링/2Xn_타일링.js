function solution(n) {
    const memo = { 1: 1, 2: 2, 3: 3, 4: 5 }
    for (let i = 3; i <= n; i++) {
        memo[i] = (memo[i - 1] % 1000000007) + (memo[i - 2] % 1000000007)
    }
    return memo[n] % 1000000007
}
