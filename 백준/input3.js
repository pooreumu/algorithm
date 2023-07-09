const input = require('fs')
    .readFileSync('./input3.txt')
    .toString()
    .trim()
    .split('\n')

console.log(
    input.reduce((acc, cur, i) => {
        return (
            acc +
            cur.split('').reduce((acc, cur, j) => {
                if (i % 2 === 0 && j % 2 === 0 && cur === 'F') return acc + 1
                if (i % 2 === 1 && j % 2 === 1 && cur === 'F') return acc + 1
                return acc
            }, 0)
        )
    }, 0)
)
