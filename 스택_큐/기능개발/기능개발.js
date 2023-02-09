function solution(progresses, speeds) {
    const result = []
    let curProgresses = [...progresses]
    while (true) {
        curProgresses = curProgresses.map((e, i) => e + speeds[i])
        let complete = 0
        for (const [i, e] of curProgresses.entries()) {
            if (e >= 100) complete++
            else break
        }
        if (complete > 0) {
            curProgresses.splice(0, complete)
            speeds.splice(0, complete)
            result.push(complete)
        }
        if (curProgresses.length <= 0) return result
    }
}
