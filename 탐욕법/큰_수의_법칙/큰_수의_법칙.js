const input = require('fs')
    .readFileSync('큰_수의_법칙.txt')
    // .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\n/)

const [_, M, K] = input[0].split(' ')
const N = input[1].split(' ').map((v) => Number(v))

console.log(solution(N, +M, +K))
console.log(solution2(N, +M, +K))

/**
 * @description 배열 n의 요소를 m번 더해서 가장 큰수를 만드는 함수
 * @description 배열의 요소는 연속해서 k번 더할 수 있다.
 * @description 요소의 값이 같더라도 다른 것으로 간주한다.
 * @param n 주어지는 배열
 * @param m 더해야 하는 수
 * @param k 연속으로 더할 수 있는 수
 * @returns {number}
 */
function solution(n, m, k) {
    let result = 0
    n.sort((a, b) => b - a)

    let count = 0
    while (count !== m) {
        for (let j = 0; j < k; j++) {
            result += n[0]
            count++
        }
        result += n[1]
        count++
    }

    return result
}

function solution2(n, m, k) {
    n.sort((a, b) => b - a)

    return (n[0] * k + n[1]) * parseInt(m / k) + ((n[0] * m) % k)
}
