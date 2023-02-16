const pop = (boards, m, n) => {
    const set = new Set()
    for (const [idx, board] of boards.entries()) {
        if (idx === m - 1) break
        for (const [i, e] of board.entries()) {
            if (i === n - 1) break
            if (e === 0) continue
            if (
                e === board[i + 1] &&
                e === boards[idx + 1][i] &&
                e === boards[idx + 1][i + 1]
            ) {
                set.add([idx, i].join(','))
                    .add([idx, i + 1].join(','))
                    .add([idx + 1, i].join(','))
                    .add([idx + 1, i + 1].join(','))
            }
        }
    }
    return set
}

const set = (boards, set, m) => {
    set.forEach((e) => {
        const [m, n] = e.split(',')
        boards[m][n] = 0
    })
    for (let i = m - 1; i > 0; i--) {
        for (const [j, e] of boards[i].entries()) {
            if (e === 0) {
                for (let k = i - 1; k >= 0; k--) {
                    if (boards[k][j] === 0) continue
                    boards[i][j] = boards[k][j]
                    boards[k][j] = 0
                    break
                }
            }
        }
    }
    return boards
}

function solution(m, n, board) {
    let answer = 0
    let boards = board.map((v) => v.split(''))

    while (true) {
        const setting = pop(boards, m, n)
        boards = set(boards, setting, m)
        if (setting.size < 4) return answer
        answer += setting.size
    }
}
