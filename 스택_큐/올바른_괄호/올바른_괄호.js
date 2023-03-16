function solution(s) {
    if (s[0] === ')') return false
    const stack = []
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '(') stack.push('(')
        else stack.pop()
    }
    return stack.length === 0
}
