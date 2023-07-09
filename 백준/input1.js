const input = require('fs').readFileSync('./input1.txt').toString().trim()

console.log(input === input.split('').reverse().join('') ? 1 : 0)
