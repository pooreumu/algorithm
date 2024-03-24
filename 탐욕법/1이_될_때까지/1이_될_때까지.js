const [input1, input2] = require('fs')
    .readFileSync('./input.txt')
    .toString()
    .trim()
    .split(' ')
    .map((v) => +v)

console.log(solution(input1, input2))

function solution(n, k) {
    let count = 0
    while (n !== 1) {
        if (n % k === 0) {
            n = n / k
        } else {
            n -= 1
        }
        count++
    }
    return count
}
