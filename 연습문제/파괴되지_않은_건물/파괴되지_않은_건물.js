function solution(board, skill) {
    const newBoard = Array.from({ length: board.length + 1 }, () =>
        new Array(board[0].length + 1).fill(0)
    )
    for (const [type, r1, c1, r2, c2, degree] of skill) {
        if (type === 1) {
            newBoard[r1][c1] -= degree
            newBoard[r2 + 1][c1] += degree
            newBoard[r1][c2 + 1] += degree
            newBoard[r2 + 1][c2 + 1] -= degree
        } else {
            newBoard[r1][c1] += degree
            newBoard[r2 + 1][c1] -= degree
            newBoard[r1][c2 + 1] -= degree
            newBoard[r2 + 1][c2 + 1] += degree
        }
    }
    for (const [i, e] of newBoard.entries()) {
        for (const [idx, el] of e.entries()) {
            if (idx) newBoard[i][idx] += newBoard[i][idx - 1]
        }
        for (const [idx, el] of e.entries()) {
            if (i) newBoard[i][idx] += newBoard[i - 1][idx]
        }
    }
    let answer = 0
    for (const [i, e] of board.entries()) {
        for (const [idx, el] of e.entries()) {
            if (el + newBoard[i][idx] > 0) answer++
        }
    }
    return answer
}
