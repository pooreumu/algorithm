function solution(n, s) {
    const quotient = Math.floor(s / n)
    if (quotient < 1) return [-1]

    let remainder = s % n

    return Array.from({ length: n }, () => quotient)
        .map((e) => {
            if (remainder === 0) return e
            remainder--
            return e + 1
        })
        .reverse()
}
