# 문제 링크

https://school.programmers.co.kr/learn/courses/30/lessons/12900?language=javascript

# 문제 풀이

피보나치다

첫번째 풀이는 재귀를 썼는데 효율성 테스트에서 런타임 에러가 나서 허용 콜스택을 초과 하는 것 같아서 for 반복문으로 풀었다

```js
function solution(n) {
    const memo = { 1: 1, 2: 2, 3: 3, 4: 5 };

    const getFibo = (n, memo) => {
        if (!memo[n]) {
            if (!memo[n - 2]) memo[n - 2] = getFibo(n - 2, memo);
            if (!memo[n - 1]) memo[n - 1] = getFibo(n - 1, memo);
            memo[n] = (memo[n - 1] + memo[n - 2]) % 1000000007;
        }
        return memo[n];
    };
    return getFibo(n, memo);
}
```

```js
function solution(n) {
    const memo = { 1: 1, 2: 2, 3: 3, 4: 5 };
    for (let i = 3; i <= n; i++) {
        memo[i] = (memo[i - 1] % 1000000007) + (memo[i - 2] % 1000000007);
    }
    return memo[n] % 1000000007;
}
```
