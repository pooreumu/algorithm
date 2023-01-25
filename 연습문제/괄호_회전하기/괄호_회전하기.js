function solution(s) {
    if (s.length % 2 === 1) return 0
    let answer = 0
    const left = ['(', '{', '[']
    const right = [')', '}', ']']
    let result = true
    for (let i = 0; i < s.length; i++) {
        const newS = s.slice(i, s.length) + s.slice(0, i)
        const stack = []
        result = true
        for (let bracket of newS) {
            if (left.includes(bracket)) stack.push(bracket)
            else {
                const stackBracket = stack.pop()
                if (right.indexOf(bracket) === left.indexOf(stackBracket))
                    continue
                result = false
                break
            }
        }
        if (result && stack.length === 0) answer++
    }
    return answer
}
