function solution(want, number, discount) {
    let result = 0

    for (let i = 0; i <= discount.length - 10; i++) {
        const obj = {}
        for (const [i, e] of want.entries()) {
            obj[e] = number[i]
        }
        for (let j = i; j < i + 10; j++) {
            obj[discount[j]] -= 1
        }
        if (Object.entries(obj).every((e) => e[1] <= 0)) result++
    }
    return result
}
