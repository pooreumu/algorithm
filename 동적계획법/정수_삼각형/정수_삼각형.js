function solution(triangle) {
    for (const [i, e] of triangle.entries()) {
        if (i === 0) {
            continue
        }
        for (const [j] of e.entries()) {
            if (j === 0) {
                triangle[i][j] += triangle[i - 1][j]
                continue
            }
            if (j === i) {
                triangle[i][j] += triangle[i - 1][j - 1]
                continue
            }
            triangle[i][j] =
                Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]) +
                triangle[i][j]
        }
    }
    return Math.max(...triangle[triangle.length - 1])
}
