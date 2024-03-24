// https://www.acmicpc.net/problem/2167

const input = require('fs')
    .readFileSync('input6.txt')
    // .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\n/)

const N = +input[0][0]
const arr = input.slice(1, N + 1).map((v) => v.split(' ').map((v) => +v))

const result = input
    .slice(N + 2)
    .map((v) => v.split(' '))
    .map(([i, j, x, y]) => {
        let sum = 0
        for (let idx = +i - 1; idx < +x; idx++) {
            for (let index = +j - 1; index < +y; index++) {
                sum += arr[idx][index]
            }
        }
        return sum
    })

console.log(result.join('\n'))
