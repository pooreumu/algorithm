function getInput(txt) {
    const file = require('fs').readFileSync(txt).toString().trim().split(/\n/)
    const [N, M] = file[0].split(' ')
    const [_, ...rest] = file.map((v) => v.split(' '))
    return { N: +N, M: +M, array: rest.map((v) => v.map((v) => +v)) }
}

console.log(solution(getInput('input1.txt')))
console.log(solution(getInput('input2.txt')))

function solution({ N: n, M: m, array }) {
    const sortedArray = array.map((v) => v.sort((a, b) => a - b))
    let result = 0

    sortedArray.forEach((v) => {
        result = v[0] > result ? v[0] : result
    })
    return result
}
