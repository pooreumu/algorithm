function solution(begin, end) {
    const getDivisor = (n) => {
        let result = 1
        for (let i = 2; i <= Math.sqrt(n); i++) {
            if (n % i === 0) {
                if (n / i > 10000000) {
                    result = i
                } else return n / i
            }
        }
        return result
    }

    const result = []

    for (let i = begin; i <= end; i++) {
        if (i === 1) {
            result.push(0)
            continue
        }
        result.push(getDivisor(i))
    }
    return result
}
