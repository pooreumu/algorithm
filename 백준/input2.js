const [input1, input2] = require('fs')
    .readFileSync('./input2.txt')
    .toString()
    .trim()
    .split(' ')
    .map((v) => +v)

const getDivisors = (num) => {
    const result = []
    let index = 1
    while (index <= Math.sqrt(num)) {
        if (num % index === 0) {
            result.push(index)
            if (num / index !== index) result.push(num / index)
        }
        index++
    }
    return result
}

const getGCF = (num1, num2) => {
    let result = 1
    const divisorsOfNum1 = getDivisors(num1).sort((a, b) => b - a)
    const divisorsOfNum2 = getDivisors(num2).sort((a, b) => b - a)
    for (let e1 of divisorsOfNum1) {
        for (let e2 of divisorsOfNum2) {
            if (e1 === e2) return e1
        }
    }
    return result
}

const getLCM = (num1, num2) => {
    return (num1 * num2) / getGCF(num1, num2)
}

console.log(getGCF(input1, input2))
console.log(getLCM(input1, input2))
