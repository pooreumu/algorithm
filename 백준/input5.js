const [n, ...arr] = require('fs')
    .readFileSync('input5.txt')
    // .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split('\n')
    .map((v) => +v)

const result = []
arr.forEach((v) => {
    if (v === 0) result.pop()
    else result.push(v)
})
console.log(result.length === 0 ? 0 : result.reduce((acc, cur) => acc + cur, 0))
