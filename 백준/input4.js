const [N, X, ...arr] = require('fs')
    .readFileSync('input4.txt')
    .toString()
    .trim()
    .split(/\s/)
    .map((v) => +v)

console.log(arr.filter((v) => v < X).join(' '))
