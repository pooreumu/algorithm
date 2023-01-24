function solution(citations) {
    let HIndex = 0
    citations.sort((a, b) => b - a)
    for (const [i, e] of citations.entries()) {
        if (i + 1 > e) break
        HIndex++
    }
    return HIndex
}
