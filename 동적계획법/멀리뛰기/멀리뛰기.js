function solution(n) {
    const getFibo = (n, fiboMemo) => {
        if (fiboMemo[n]) return fiboMemo[n] % 1234567
        fiboMemo[n] = getFibo(n - 1, fiboMemo) + getFibo(n - 2, fiboMemo)
        return fiboMemo[n] % 1234567
    }
    return getFibo(n, [0, 1, 2])
}
