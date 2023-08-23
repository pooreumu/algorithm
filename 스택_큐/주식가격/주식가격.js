function solution(prices) {
    return prices.map((price, i, origin) => {
        if (i === origin.length - 1) {
            return 0
        }
        for (let j = i + 1; j < origin.length; j++) {
            if (price > origin[j]) {
                return j - i
            }
        }
        return origin.length - i - 1
    })
}
