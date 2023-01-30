function solution(k, tangerine) {
    const sizeType = {}
    tangerine.forEach((e) => {
        if (sizeType[e]) sizeType[e]++
        else sizeType[e] = 1
    })

    for (const [i, e] of Object.values(sizeType)
        .sort((a, b) => b - a)
        .entries()) {
        k -= e
        if (k <= 0) return i + 1
    }
}
