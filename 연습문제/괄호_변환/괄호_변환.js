function solution(p) {
    const balance = (string) => {
        const stack = []
        for (let i = 0; i < string.length; i++) {
            string[i] === '(' ? stack.push('(') : stack.pop()
        }
        return stack.length === 0 ? true : false
    }
    const task = (w) => {
        if (w === '') return ''
        let u = '',
            v = '',
            uCount = 0,
            vCount = 0
        for (let i = 0; i < w.length; i++) {
            if (w[i] === ')') {
                u += ')'
                uCount++
            } else {
                u += '('
                vCount++
            }
            if (uCount !== 0 && uCount === vCount) {
                v = w.substring(i + 1)
                break
            }
        }
        if (balance(u)) {
            return u + task(v)
        } else {
            v = task(v)
            let result = '(' + v + ')'
            for (let i = 1; i < u.length - 1; i++) {
                u[i] === ')' ? (result += '(') : (result += ')')
            }
            return result
        }
    }
    return task(p)
}
