function solution(n, m, section) {
    let answer = 0
    while (section.length !== 0) {
        answer++
        const start = section[0]
        for (let i = start; i < start + m; i++) {
            if (section[0] === i) section.shift()
        }
    }
    return answer
}
